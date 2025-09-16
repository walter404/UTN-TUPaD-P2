package tp3;


public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public Libro(String titulo, String autor, int añoPublicacion){
        this.titulo = titulo;
        this.autor = autor;        
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= 2025) {
            this.añoPublicacion = añoPublicacion;
        }
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + añoPublicacion);
    }

    
}
