
package ejercicio1;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    
    public Titular(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void getPasaporte() {
        if (pasaporte != null) {
            System.out.println("Pasaporte: " + pasaporte.getNumero());
        } else {
            System.out.println("No posee pasaporte");
        }
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        
        if (pasaporte != null) {
            pasaporte.setTitular(this);
        }
    }
    
    
}
