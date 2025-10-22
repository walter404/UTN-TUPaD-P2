package tp7.Ejercicio3;

public class EmpleadoPlanta extends Empleo {

    private double sueldo;
    private int antiguedad;

    public EmpleadoPlanta(double sueldo, int antiguedad, String nombre, String apellido, String id) {
        super(nombre, apellido, id);
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    @Override
    public double calcularSueldo() {
        return sueldo * antiguedad;
    }
}
