
package tp8;

import java.util.ArrayList;
import java.util.List;
import tp8.Interfaces.Pagable;

public class Pedido implements Pagable{
    private List<Producto> productos = new ArrayList<>();
    private String estado = "Pendiente";
    private Cliente cliente;// se necesita una refencia del cliente para notificar

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    @Override
    public double calcularTotal(){
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
            
        }
        return total;//calculamos la suma total de los productos
    }
    
    public  void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        //se notific al cliente cuando el estado del pedido cambia
        cliente.notificarCambioEstado("El estado de su pedido cambia a: " + nuevoEstado);
    }
}
