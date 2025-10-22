
package tp7.Ejercicio1;


public class Auto extends Vehiculo{
    private int cantidadPuertas;
    
    public  Auto(String marca, String modelo, int cantidadPuertas){
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // llama al método del padre
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }

    
}
