package AccesoADatos;

import Entidades.Telefono;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TelefonoData {

    private Connection con = null;

    public TelefonoData() {
        con = Conexion.getConexion();
    }

    public void guardarTelefono(Telefono tel) {
        String sql = "INSERT INTO telefono(idPaciente, telefono) VALUES (?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tel.getIdPaciente());
            ps.setInt(2, tel.getTelefono());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                tel.setIdTelefono(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Teléfono guardado");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Teléfono" + e.getMessage());
        }
    }

    public void modificarTelefono(Telefono tel) {
        String sql = "UPDATE telefono SET idPaciente=?, tel=? WHERE idTelefono=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, tel.getIdPaciente());
            ps.setInt(2, tel.getTelefono());
            ps.setInt(3, tel.getIdTelefono());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Teléfono modificado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar teléfono\n" + e.getMessage());
        }
    }

    public void eliminarTelefono(int idTelefono) {
        String sql = "DELETE FROM telefono WHERE idTelefono=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTelefono);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Teléfono eliminado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Teléfono");
        }
    }

    public List<Telefono> listarTelefonoPorPaciente(int idPaciente) {
        String sql = "SELECT tel, idTelefono FROM telefono WHERE idPaciente=?";
        ArrayList<Telefono> telefonos = new ArrayList<>();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Telefono tel = new Telefono();
                tel.setIdPaciente(idPaciente);
                tel.setIdTelefono(rs.getInt("idTelefono"));
                tel.setTelefono(rs.getInt("tel"));
                telefonos.add(tel);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Teléfono");
        }
        return telefonos;
    }
}
