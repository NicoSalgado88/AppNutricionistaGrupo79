
package Entidades;

import java.util.ArrayList;


public class Paciente {
    private int idPaciente, dni;
    private String nombre, domicilio;
//    private ArrayList<Telefono> tel;
    private int tel;
    private boolean activo;

    public Paciente() {
    }

    public Paciente(int idPaciente, int dni, String nombre, String domicilio, int tel, boolean activo) {
        this.idPaciente = idPaciente;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.tel = tel;
        this.activo = activo;
    }

    public Paciente(int dni, String nombre, String domicilio, int tel, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.tel = tel;
        this.activo = activo;
    }

    
//    public Paciente(int dni, String nombre, String domicilio, ArrayList<Telefono> tel, boolean activo) {
//        this.dni = dni;
//        this.nombre = nombre;
//        this.domicilio = domicilio;
//        this.tel = new ArrayList<>();
//        this.activo=activo;
//    }
//
//    public Paciente(int idPaciente, int dni, String nombre, String domicilio, ArrayList<Telefono> tel, boolean activo) {
//        this.idPaciente = idPaciente;
//        this.dni = dni;
//        this.nombre = nombre;
//        this.domicilio = domicilio;
//        this.tel = new ArrayList<>();
//        this.activo=activo;
//    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

//    public ArrayList<Telefono> getTel() {
//        return tel;
//    }
//
//    public void setTel(ArrayList<Telefono> tel) {
//        this.tel = tel;
//    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idPaciente+" - "+nombre;
    }
    
    
    
}
