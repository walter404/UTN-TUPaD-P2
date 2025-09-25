
package tp4;


public class Empleado {
    //Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    //atributo estatico
    private static int totalEmpleados = 0;
    
    //Contructores con this
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        Empleado.totalEmpleados++;
    }
    
    //Constructor parcial
    public Empleado(String nombre, String puesto){
        this.id = ++Empleado.totalEmpleados; //pre-incrementa y usa el nuevo valor como ID
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.00;
    }
    
    //getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    
    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //actualizar el salario por un porcentaje
    public void actualizarSalario(double porcentajeAumento){
        if (porcentajeAumento > 0) {
            this.salario *= (1 + porcentajeAumento / 100);
        }
    }
    
    //actualizar el salario por una cantidad fija
    public void actualizarSalario(int cantidadFija){
        if (cantidadFija > 0) {
            this.salario += cantidadFija;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public static int mostrarTotalEmpleado(){
        return Empleado.totalEmpleados;
    }
}
