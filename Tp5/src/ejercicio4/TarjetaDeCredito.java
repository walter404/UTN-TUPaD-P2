/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Walter
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimineto;
    private Cliente cliente;
    private Banco banco;
    
    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco){
        this.numero = numero;
        this.fechaVencimineto = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimineto() {
        return fechaVencimineto;
    }

    public void setFechaVencimineto(String fechaVencimineto) {
        this.fechaVencimineto = fechaVencimineto;
    }

    public Cliente getCliente() {
        if (cliente != null) {
            return cliente;
        } else {
            return null;
        }
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        
        if (cliente != null) {
            cliente.setTarjeta(this);
        }
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    
}
