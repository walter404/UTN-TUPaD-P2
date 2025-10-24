
package tp8;

import tp8.Interfaces.Notificable;

public class Cliente implements Notificable{
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void notificarCambioEstado(String mensaje){
        System.out.println("Cliente: " + nombre + " notificado: " + mensaje);
    }
}
