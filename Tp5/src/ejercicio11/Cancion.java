/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Walter
 */
public class Cancion {
    private String titulo;
    private Artista artista;
    
    public Cancion(String titulo, Artista artista){
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        if (artista != null) {
            return artista;
        } else {
            return null;
        }
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    
}
