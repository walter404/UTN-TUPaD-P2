
package tp7.Ejercicio3;

public class EmpleadoTemporal extends Empleo{
    private double sueldo;
    private int valorHora;

    public EmpleadoTemporal(double sueldo, int valorHora, String nombre, String apellido, String id) {
        super(nombre, apellido, id);
        this.sueldo = sueldo;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSueldo(){
        return sueldo * valorHora;
    }
}
