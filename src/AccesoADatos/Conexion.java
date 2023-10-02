
package AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB="nutricionista";
    private static final String USUARIO="root";
    private static String PASSWORD="";
    private static Connection conec;

    public Conexion() {
    }
    
    public static Connection getConexion(){
        if(conec==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conec=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
            } catch (ClassNotFoundException | SQLException x) {
                JOptionPane.showMessageDialog(null, "error al conectar");
            }
        }
        return conec;
    }
}
