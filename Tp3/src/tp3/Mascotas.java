
package tp3;


public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascotas(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    public void cumplirAnios(){
        edad++;
        System.out.println(nombre + " cumplio dos años, ahora tiene " + edad);
    }
}
