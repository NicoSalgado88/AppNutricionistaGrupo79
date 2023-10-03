package AccesoADatos;

import Entidades.Dieta;
import Entidades.Paciente;
import java.sql.*;
import javax.swing.JOptionPane;

public class DietaData {

    private Connection con = null;

    public DietaData() {
        con = Conexion.getConexion();
    }

    public void guardarDieta(Dieta dieta) {
        String sql = "INSERT INTO dieta (nombre, idPaciente, fechaInicial, fechaFinal, pesoInicial, pesoFinal, pesoActual, estado) VALUES (? ,? ,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDate(3, Date.valueOf(dieta.getfInicio()));
            ps.setDate(4, Date.valueOf(dieta.getfFin()));
            ps.setDouble(5, dieta.getpInicial());
            ps.setDouble(6, dieta.getpFinal());
            ps.setDouble(7, dieta.getpActual());
            ps.setBoolean(8, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                dieta.setIdDieta(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Dieta guardada");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta");
        }
    }

    public void modificarDieta(Dieta dieta) {
        String sql = "UPDATE dieta SET nombre=?, idPaciente=?, fechaInicial=?, fechaFinal=?, pesoInicial=?, pesoFinal=?, pesoActual=?, estado=? WHERE idDieta=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDate(3, Date.valueOf(dieta.getfInicio()));
            ps.setDate(4, Date.valueOf(dieta.getfFin()));
            ps.setDouble(5, dieta.getpInicial());
            ps.setDouble(6, dieta.getpFinal());
            ps.setDouble(7, dieta.getpActual());
            ps.setBoolean(8, true);
            ps.setInt(9, dieta.getIdDieta());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Dieta modificada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar dieta\n" + e.getMessage());
        }
    }

        public Dieta buscarDieta(int id){
        String sql="SELECT nombre, idPaciente, fechaInicial, fechaFinal, pesoInicial, pesoFinal, pesoActual, estado FROM dieta WHERE idDieta=? AND estado=1";
        Dieta dieta=null;
        PreparedStatement ps=null;
        Paciente paciente=new Paciente();
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                dieta=new Dieta();
                dieta.setIdDieta(id);
                dieta.setPaciente(paciente);
                dieta.setNombre(rs.getString("nombre"));
                dieta.setfInicio(rs.getDate("fechaInicial").toLocalDate());
                dieta.setfFin(rs.getDate("fechaFinal").toLocalDate());
                dieta.setpInicial(rs.getDouble("pesoInicial"));
                dieta.setpFinal(rs.getDouble("pesoFinal"));                                           
                dieta.setpActual(rs.getDouble("pesoActual"));                                           
                dieta.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null, "La dieta no existe");
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta");
        }
        return dieta;
    }
    
    
    public void eliminarDieta(int id) {
        String sql = "UPDATE dieta SET estado=0 WHERE idDieta=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Dieta eliminada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta");
        }
    }
}
