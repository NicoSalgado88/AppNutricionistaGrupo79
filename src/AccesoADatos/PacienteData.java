
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
    
     public void modificarPaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET nombre=?, dni=?, domicilio=? WHERE idPaciente=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1 , paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setInt(4, paciente.getIdPaciente());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente modificado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar paciente\n"+e.getMessage());
        }
    }
     
     public void eliminarPaciente(int id) {
        String sql = "UPDATE paciente SET estado=0 WHERE idPaciente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente eliminado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Paciente");
        }
    }
     
      public Paciente buscarPaciente(int id){
        String sql="SELECT nombre, dni, domicilio FROM paciente WHERE idPaciente=? AND estado=1";
        Paciente paciente=null;
        PreparedStatement ps=null;
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                paciente=new Paciente();
                paciente.setIdPaciente(id);
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));                              
                paciente.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null, "El paciente no existe");
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Paciente");
        }
        return paciente;
    }
    
    
}
