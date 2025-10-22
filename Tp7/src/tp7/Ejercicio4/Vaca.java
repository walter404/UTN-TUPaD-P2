
package tp7.Ejercicio4;

public class Vaca extends Animal{

    public Vaca(String tipoAnimal) {
        super(tipoAnimal);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(tipoAnimal + " Sonido es: muu muuu" );
    }
}
