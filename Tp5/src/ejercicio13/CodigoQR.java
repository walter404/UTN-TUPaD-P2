/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author Walter
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario;
    
    public CodigoQR(String valor, Usuario usuario){
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        if (usuario != null) {
            return usuario;
        } else {
            return null;
        }
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }  
}
