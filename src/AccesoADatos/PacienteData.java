
package AccesoADatos;

import Entidades.Paciente;
import java.sql.*;
import javax.swing.JOptionPane;



public class PacienteData {
    private Connection con=null;

    public PacienteData() {
        con=Conexion.getConexion();
    }
    
    public void guardarPaciente(Paciente paciente){
        String sql="INSERT INTO paciente(nombre, dni, domicilio, estado) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setBoolean(4, paciente.isActivo());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                JOptionPane.showMessageDialog(null, "Paciente Agregado");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente"+e.getMessage());
        }
    }
    
}
