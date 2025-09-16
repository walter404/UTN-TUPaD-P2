
package tp3;


public class Tp3 {

    
    public static void main(String[] args) {
   
    //Traemos la instacia de un estudiante
    Estudiantes e1 = new Estudiantes("Walter", "Verdun", "Programacion 2", 9.50);
    //Informacion inicial
    e1.mostrarInfo();
    //subir la calificacion
    e1.subirCalificacion(0.50);
    //Bajar la calificacion
    e1.bajarCalificacion(1);
    //Mostrar calificacion final
    e1.mostrarInfo();
    
        System.out.println("");
    
    //creamos una mascota
    Mascotas m1 = new Mascotas("Pluto", "Canina", 3);
    //Informacion inicial
    m1.mostrarInfo();
    //Simular paso del tiempo
    m1.cumplirAnios();
    m1.cumplirAnios();
    //Mostrar informacion final
    m1.mostrarInfo();
    
        System.out.println("");
    
    //Creacion de libro
    Libro libro1 = new Libro("Historia de cronopios y de fama", "Julio Cortazar", 1962);
    //Intento de modificar el año publicado con valor invalido
    libro1.setAñoPublicacion(-1500);
    //Intento de modificar el año con valor valido
    libro1.setAñoPublicacion(1970);
    //Informacion final
    libro1.mostrarInfo();
    
        System.out.println("");
    
    //Creamos dos gallinas
    Gallina g1 = new Gallina(1, 2);
    Gallina g2 = new Gallina(2, 1);
    //acciones
    g1.ponerHuevo();
    g1.ponerHuevo();
    g1.envejecer();
    
    g2.ponerHuevo();
    g2.envejecer();
    g2.envejecer();
    //Estado final
    g1.mostrarEstado();
    g2.mostrarEstado();
    
        System.out.println("");
        
    //Creacion de nave
    NaveEspacial nave1 = new NaveEspacial("Navegar-747", 50);
    //Avanzar sin recargar combustibler
    nave1.avanzar(30);
    //Recarga de combustible
    nave1.recargarCombustible(40);
    //Despegar
    nave1.despegar();
    nave1.avanzar(20);
    //Estado final
    nave1.mostrarEstado();
    }           
}
