
package ejercicio1;


public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte(String numero, String fechaEmision, String img, String fmt, Titular titular){
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(img, fmt);
        this.titular = titular;
        
        this.titular.setPasaporte(this);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public void getTitular() {
        if (titular != null) {
            System.out.println("Titular: " + titular.getDni());
        }else {
            System.out.println("No posee titular");
        }
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }
    
    
}
