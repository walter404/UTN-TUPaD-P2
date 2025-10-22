
package tp7.Ejercicio2;

public class Rectangulo extends Figura{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto, String nombre) {
        super(nombre);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea(){
        return ancho * alto;
    }
    
    
}
