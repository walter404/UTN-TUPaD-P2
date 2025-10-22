
package tp7.Ejercicio4;

public class Gato extends Animal{

    public Gato(String tipoAnimal) {
        super(tipoAnimal);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(tipoAnimal + " Sonido es: miau miauu");
    }
}
