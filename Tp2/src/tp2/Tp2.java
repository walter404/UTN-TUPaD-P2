package tp2;

import java.util.Scanner;


public class Tp2 {
    
    final static Scanner input = new Scanner(System.in);
    
    //variable global del ejercicio 11
    final static double DESCUENTO_ESPECIAL = 0.10;
    //Ejercicio 8 Método que calcula el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // impuesto y descuento vienen en porcentaje, por eso se dividen entre 100
        
        return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
    }
    
    //Ejercicio 9
    // a. Calcular costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;
        
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10;
        } else {
            System.out.println("Zona no válida. Se asume costo 0.");
        }
        
        return costoEnvio;
    }
    
    // b. Calcular total de compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    //Ejercicio 10 Método que calcula el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    
    //Ejercicio 11 Método que calcula el descuento especial
    public static void calcularDescuentoEspecial(double precio) {
        
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + (Math.round(DESCUENTO_ESPECIAL * 100)) + "\nEl precio final con descuento es: " + precioFinal);
    }
    
    public static void main(String[] args) {
        
        //Ejercicio 1
        System.out.println("Ingrese un anio: ");
        int anio = Integer.parseInt(input.nextLine());
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " Es bisiesto");
        } else {
            System.out.println(anio + " no es bisiesto");
        }
        
        //Ejercicio 2
        /*System.out.println("Ingrese el primer numero: ");
        int n1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo numero: ");
        int n2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el tercero numero: ");
        int n3 = Integer.parseInt(input.nextLine());
        
        int mayor;
        
        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        }else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else{
            mayor = n3;
        }
        
        System.out.println("El numero mayor es: " + mayor); */
        
        //ejercicio 3
        /*System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        if (edad >= 60) {
            System.out.println("Eres Adulto mayor");
        } else if (edad >= 18) {
            System.out.println("Eres Adulto");
        } else if (edad >= 12) {
            System.out.println("Eres un Adolocente");
        }else {
            System.out.println("Eres un Niño");
        }*/
        
        //Ejercicio 4
        /*System.out.println("Ingrese el precio: ");
        double precio = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la categoria (A, B, C): ");
        String categoria = input.nextLine();
        
        double resultado;
        double descuento = 0;
        
        switch (categoria) {
            case "A":
                descuento = 0.10;
                resultado = precio - (precio * descuento);
                break;
            case "B":
                descuento = 0.15;
                resultado = precio - (precio * descuento);
                break;
            case "C":
                descuento = 0.20;
                resultado = precio - (precio * descuento);
                break;
            default:
                resultado = precio;
                System.out.println("Categoria no valida");
                break;
        }
        System.out.println("Descuento aplicado: " + (Math.round(descuento * 100)) + "\nPrecio final: " + resultado);*/
        
        //Ejercicio 5
        /*System.out.println("Ingrese un numero: ");
        int numero = Integer.parseInt(input.nextLine());
        
        int resultado = 0;
        
        while (numero != 0) {            
            if (numero % 2 == 0) {
                resultado += numero;
            }
            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(input.nextLine());
        }
        System.out.println("La suma de los numeros pare es: " + resultado);*/
        
        //ejercicio 6
        /*int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            int num = Integer.parseInt(input.nextLine());
            
            if (num > 0) {
                positivos++;
            }else if (num < 0) {
                negativos++;
            }else{
                ceros++;
            }
        }
        System.out.println("Resultados:\nPositivos: " + positivos + "\nNegativos: " + negativos + "\nCeros: " + ceros);*/
        
        //Ejercicio 7
        /*int nota;
        
        do {            
            System.out.println("Ingrese una nota (0-10):  ");
            nota = Integer.parseInt(input.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente. ");*/
        
        
        //Ejercicio 8
        /*System.out.println("ngrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(input.nextLine());
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);*/
        
        //Ejercicio 9
        /*System.out.println("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es: " + costoEnvio + "\nEl total a pagar es: " + total);*/
        
        //Ejercicio 10
        /*System.out.println("Ingresar el stock  actual: ");
        int stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresar la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresar la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);*/
        
        //Ejercicio 11
        
        /*double precioProducto = 200.0; 
        // Llamar al método
        calcularDescuentoEspecial(precioProducto);*/
        
        //Ejercicio 12 array
        //a. Declare e inicialice un array con los precios de algunos productos.
        /*double[] precios = {100.7, 250.5, 75.5, 300.2, 120.5};
        
        //b. Muestre los valores originales de los precios.
        System.out.println("Precios Originales");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: " + precios[i]);
        }
        
        //c. Modifique el precio de un producto específico.
        precios[2] = 90.5;
        
        //d. Muestre los valores modificados.
        System.out.println("Precio Modificado");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: " + precios[i]);
        }*/
        
        //Ejercicio 13
        /*double[] preciosPro = {129.5, 259.5, 75.5, 39.9, 120.5};
        
        // Mostrar precios originales
        System.out.println("Precios Originales: ");
        for (double precio : preciosPro) {
            System.out.println("Precio: " + precio);
        }
        
        // Modificar valor acá sí necesitamos índice
        preciosPro[2] = 80.5;
        
        // Mostrar precios modificados
        System.out.println("Precios modificados: ");
        for (double precio : preciosPro) {
            System.out.println("Precio: " + precio);
        }*/
    }
        
    
    
}
