package tp3;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; 
    
    public NaveEspacial(String nombre, int combustible){
        this.nombre = nombre;
        if (combustible > MAX_COMBUSTIBLE) {
            this.combustible = MAX_COMBUSTIBLE;
        }else if(combustible < 0){
            this.combustible= 0;
        }else{
            this.combustible = combustible;
        }
    }
    
    public void despegar(){
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        }else{
            System.out.println("No hay sufuciente combustible");
        }
    }
    
    //metodo de avanzar
    public void avanzar(int distancia){
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + "km. Combustible restante: " + combustible);
        }else{
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }
    
    //Metodo recargar combustible
    public void recargarCombustible(int cantidad){
        if (cantidad <= 0) {
            System.out.println("la cantidad de recarga de ser positiva");
            return;
        }
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println(nombre + " se recargo" + MAX_COMBUSTIBLE);
        }else {
            combustible += cantidad;
            System.out.println(nombre + " recargó " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }
    
    //Estado
    public void mostrarEstado(){
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}
