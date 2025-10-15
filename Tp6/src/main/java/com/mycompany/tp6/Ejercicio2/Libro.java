
package com.mycompany.tp6.Ejercicio2;

public class Libro {
        private String isbn;
    private String titulo;
    private int añoPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int añoPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.printf("ISBN: %s | Título: %s | Año: %d | Autor: %s (%s)%n",
                isbn, titulo, añoPublicacion, autor.getNombre(), autor.getNacionalidad());
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
}
