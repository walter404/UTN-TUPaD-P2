/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Walter
 */
public class Propietario {
    private String nombre;
    private String dni;
    private  Computadora computadora;
    
    public Propietario(String nombre, String dni){
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

    public Computadora getComputadora() {
        if (computadora != null) {
            return computadora;
        } else {
            return null;
        }
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        
        if (computadora != null) {
            computadora.setPropietario(this);
        }
    }
    
    
}
