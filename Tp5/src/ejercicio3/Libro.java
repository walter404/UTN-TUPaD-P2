/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Walter
 */
public class Libro {
       private String titulo;
       private String isbn;
       private Autor autor;
       private Editorial editorial;
       
       public Libro(String titulo, String isbn, Autor autor, Editorial editorial){
           this.titulo = titulo;
           this.isbn = isbn;
           this.autor = autor;
           this.editorial = editorial;
       }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void getAutor() {
        if (autor != null) {
            System.out.println("Autor: " + autor.getNombre());
        } else {
            System.out.println("No tiene autor");
        }
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
       
       
}
