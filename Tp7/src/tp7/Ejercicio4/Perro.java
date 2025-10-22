
package tp7.Ejercicio4;

public class Perro extends Animal{

    public Perro(String tipoAnimal) {
        super(tipoAnimal);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(tipoAnimal + " Sonido es: Gua guau");
    }
}
