package tp4;
public class Tp4 {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado(101, "Juan Perez", "Desarrollador mid", 1500.00);
        System.out.println(" Empleado 1 ");
        System.out.println(empleado1); //llamada a toString
        
        
        Empleado empleado2 = new Empleado("Ana Gomez", "Marketing");
        System.out.println(" Empleado 2 ");
        System.out.println(empleado2);
        
        //Aumento por porcentaje
        empleado1.actualizarSalario(10.0);
        System.out.println(" Salario actualizado por porcentaje ");
        System.out.println(empleado1);
        
        //Aumento por cantidad fija
        empleado2.actualizarSalario(500);
        System.out.println(" Salario actualizado por cantidad fija ");
        System.out.println(empleado2);
        
        //Total de empleado
        System.out.println("Total de empleados");
        //metodo estatico se llama directamente de la clase
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleado());
    }
    
}
