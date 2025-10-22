
package tp7.Ejercicio1;


public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo(){
        System.out.println("La marca es: " + marca + "El modelo es: " + modelo);
    }
}
