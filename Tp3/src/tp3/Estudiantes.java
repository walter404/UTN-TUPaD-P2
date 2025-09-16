
package tp3;


public class Estudiantes {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiantes(String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void  subirCalificacion(double notas){
        calificacion += notas;
        System.out.println("Su calificacion aumento: " + calificacion);
    }
    
    public void bajarCalificacion(double notas){
        calificacion -= notas;
        if (calificacion < 0) {
            calificacion = 0;
        }
        System.out.println("Su calificacion bajo a: " + calificacion);
    }
}
