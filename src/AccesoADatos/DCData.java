/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class DCData {

    private Connection con = null;

    public DCData() {
        con = Conexion.getConexion();
    }

    public void guardarDC(DietaComida dc) {
        String sql = "INSERT INTO dietacomida (idComida, idDieta) VALUES (?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dc.getComida().getIdComida());
            ps.setInt(2, dc.getDieta().getIdDieta());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                dc.setIdDC(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Dieta-Comida guardada");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta-Comida" + e.getMessage());
        }
    }

    public void modificarDC(DietaComida dc) {
        String sql = "UPDATE dietacomida SET idComida=?, idDieta=? WHERE idDC=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dc.getComida().getIdComida());
            ps.setInt(2, dc.getDieta().getIdDieta());
            ps.setInt(3, dc.getIdDC());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Dieta-Comida modificada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar Dieta-Comida\n" + e.getMessage());
        }
    }

    public void eliminarDC(int idDC) {
        String sql = "DELETE FROM dietacomida WHERE idDC=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDC);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Dieta-Comida eliminada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta-Comida");
        }
    }
    //SELECT dieta.nombre, comida.nombre FROM `dietacomida` JOIN dieta ON dietacomida.idDieta=dieta.idDieta JOIN comida ON dietacomida.idComida=comida.idComida

    public List<Comida> listarComidaPorDieta(int idDieta) {
        String sql = "SELECT comida.idComida, comida.nombre, detalle, cantCalorias FROM comida JOIN dietacomida ON dietacomida.idComida=comida.idComida "
                + "JOIN dieta ON dietacomida.idDieta=dieta.idDieta WHERE dietacomida.idDieta=?";
        ArrayList<Comida> comidas = new ArrayList<>();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comida com = new Comida();
                com.setIdComida(rs.getInt("idComida"));
                com.setNombre(rs.getString("nombre"));
                com.setDetalle(rs.getString("detalle"));
                com.setCantCal(rs.getInt("cantCalorias"));
                com.setActivo(true);
                comidas.add(com);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta-Comida");
        }
        return comidas;
    }

    public List<Dieta> listarDietaPorComida(int idComida) {
        String sql = "SELECT dieta.idDieta, dieta.nombre, idPaciente, fechaInicial, fechaFinal, pesoFinal, pesoInicial, pesoActual, dieta.estado "
                + "FROM dieta JOIN dietacomida ON dietacomida.idDieta=dieta.idDieta JOIN comida ON dietacomida.idComida=comida.idComida "
                + "WHERE dietacomida.idComida=?";
        ArrayList<Dieta> dietas = new ArrayList<>();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idComida);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta d = new Dieta();
                Paciente p = new Paciente();
                d.setIdDieta(rs.getInt("idDieta"));
                d.setNombre(rs.getString("nombre"));
                d.setPaciente(p);
                p.setIdPaciente(rs.getInt("idPaciente"));
                d.setfInicio(rs.getDate("fechaInicial").toLocalDate());
                d.setfFin(rs.getDate("fechaFinal").toLocalDate());
                d.setpInicial(rs.getDouble("pesoInicial"));
                d.setpFinal(rs.getDouble("pesoFinal"));
                d.setpActual(rs.getDouble("pesoActual"));
                d.setActivo(rs.getBoolean("estado"));
                dietas.add(d);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Dieta-Comida");
        }
        return dietas;
    }

    public DietaComida buscarDC(int idDieta, int idComida) {
        String sql = "SELECT idDC FROM dietacomida WHERE idDieta=? AND idComida=?";
        DietaComida dc = null;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ps.setInt(2, idComida);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dc = new DietaComida();
                dc.setIdDC(rs.getInt("idDC"));
            } else {
                JOptionPane.showMessageDialog(null, "La relación Dieta-Comida no existe");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla DietaComida");
        }
        return dc;
    }
}
