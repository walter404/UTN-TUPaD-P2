/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author Walter
 */
public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto){
        System.out.println("Exportando proyecto a formato " + formato + "...");
        Render nuevoRender = new Render(formato, proyecto);
        return nuevoRender;
    }
}
