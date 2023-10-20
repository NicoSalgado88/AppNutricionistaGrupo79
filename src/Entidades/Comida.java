package Entidades;

public class Comida {

    private int idComida, cantCal;
    private String nombre, detalle;
    private boolean activo;

    public Comida() {
    }

    public Comida(int cantCal, String nombre, String detalle, boolean activo) {
        this.cantCal = cantCal;
        this.nombre = nombre;
        this.detalle = detalle;
        this.activo = activo;
    }

    public Comida(int idComida, int cantCal, String nombre, String detalle, boolean activo) {
        this.idComida = idComida;
        this.cantCal = cantCal;
        this.nombre = nombre;
        this.detalle = detalle;
        this.activo = activo;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public int getCantCal() {
        return cantCal;
    }

    public void setCantCal(int cantCal) {
        this.cantCal = cantCal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Comida{" + "idComida=" + idComida + ", cantCal=" + cantCal + ", nombre=" + nombre + ", detalle=" + detalle + ", activo=" + activo + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Comida otraComida = (Comida) obj;
        return idComida == otraComida.idComida;
    }

}
