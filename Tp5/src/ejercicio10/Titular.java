/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Walter
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    
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

    public CuentaBancaria getCuenta() {
        if (cuenta != null) {
            return cuenta;
        } else {
            return null;
        }
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        
        if (cuenta != null) {
            cuenta.setTitular(this);
        }
    }
    
    
}
