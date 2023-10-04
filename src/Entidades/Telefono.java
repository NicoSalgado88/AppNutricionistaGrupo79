package Entidades;

public class Telefono {

    private int telefono;
    private int idPaciente, idTelefono;

    public Telefono() {
    }

    public Telefono(int idPaciente, int telefono) {
        this.idPaciente = idPaciente;
        this.telefono = telefono;

    }

    public Telefono(int idTelefono, int idPaciente, int telefono) {
        this.telefono = telefono;
        this.idTelefono = idTelefono;
        this.idPaciente = idPaciente;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "Telefono{" + "telefono=" + telefono + ", idPaciente=" + idPaciente + ", idTelefono=" + idTelefono + '}';
    }

}
