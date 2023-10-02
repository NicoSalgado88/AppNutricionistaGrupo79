
package Entidades;

import java.time.LocalDate;


public class Dieta {
    private int idDieta;
    private String nombre;
    private Paciente paciente;
    private LocalDate fInicio, fFin;
    private double pInicial, pFinal;
    private boolean activo;

    public Dieta() {
    }

    public Dieta(String nombre, Paciente paciente, LocalDate fInicio, LocalDate fFin, double pInicial, double pFinal, boolean activo) {
        this.nombre = nombre;
        this.paciente = paciente;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.pInicial = pInicial;
        this.pFinal = pFinal;
        this.activo=activo;
    }

    public Dieta(int idDieta, String nombre, Paciente paciente, LocalDate fInicio, LocalDate fFin, double pInicial, double pFinal, boolean activo) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.paciente = paciente;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.pInicial = pInicial;
        this.pFinal = pFinal;
        this.activo=activo;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getfInicio() {
        return fInicio;
    }

    public void setfInicio(LocalDate fInicio) {
        this.fInicio = fInicio;
    }

    public LocalDate getfFin() {
        return fFin;
    }

    public void setfFin(LocalDate fFin) {
        this.fFin = fFin;
    }

    public double getpInicial() {
        return pInicial;
    }

    public void setpInicial(double pInicial) {
        this.pInicial = pInicial;
    }

    public double getpFinal() {
        return pFinal;
    }

    public void setpFinal(double pFinal) {
        this.pFinal = pFinal;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
