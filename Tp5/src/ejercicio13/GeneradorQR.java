/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author Walter
 */
public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario){
        System.out.println("Generando el codigo QR");
        CodigoQR nuevoQR = new CodigoQR(valor, usuario);
        return nuevoQR;
    }
}
