
package Entidades;

public class Telefono {
    private int telefono;
    private int idPaciente;
    public Telefono() {
    }

    public Telefono(int telefono) {
        this.telefono = telefono;
        
    }

    public Telefono(int telefono, int idPaciente) {
        this.telefono = telefono;
        this.idPaciente = idPaciente;
    }

    public int getTelefono() {
        return telefono;
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
    
    
    
}
