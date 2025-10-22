
package tp7.Ejercicio4;

public class Animal {
    protected String tipoAnimal;

    public Animal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    
    //Metodo
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    
    public void describirAnimal(){
        System.out.println("Soy un animal de tipo: " + tipoAnimal);
    }
}
