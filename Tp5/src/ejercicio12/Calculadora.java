/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Walter
 */
public class Calculadora {
    public void calcular(Impuesto impuesto){
        double total = impuesto.getMonto() * 1.21;
        System.out.println("Calculo a realizar, monto IVA: " + total);
    }
}
