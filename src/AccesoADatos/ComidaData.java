
package AccesoADatos;

import Entidades.Comida;
import java.sql.*;
import javax.swing.JOptionPane;


public class ComidaData {
    private Connection con = null;

    public ComidaData() {
        con = Conexion.getConexion();
    }
    
      public void guardarComida(Comida comida) {
        String sql = "INSERT INTO comida (nombre, detalle, cantCalorias, estado) VALUES (? ,? ,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setDouble(3, comida.getCantCal());
            ps.setBoolean(4, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                comida.setIdComida(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Comida guardada");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Comida");
        }
    }
      
       public void modificarComida(Comida comida) {
        String sql = "UPDATE comida SET nombre=?, detalle=?, cantCalorias=? WHERE idComida=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setDouble(3, comida.getCantCal());
            ps.setInt(4, comida.getIdComida());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Comida modificada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar comida\n" + e.getMessage());
        }
    }
       
        public Comida buscarComida(int id){
        String sql="SELECT nombre, detalle, cantCalorias FROM comida WHERE idComida=? AND estado=1";
        Comida comida=null;
        PreparedStatement ps=null;
        
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                
                comida=new Comida();
                comida.setIdComida(id);
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCal(rs.getInt("cantCalorias"));
                
                comida.setActivo(true);
                System.out.println("final");
            }else{
                JOptionPane.showMessageDialog(null, "La comida no existe");
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Comida");
        }
        return comida;
    } 
        
        public void eliminarComida(int id) {
        String sql = "UPDATE comida SET estado=0 WHERE idComida=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Comida eliminada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Comida");
        }
    }
}
