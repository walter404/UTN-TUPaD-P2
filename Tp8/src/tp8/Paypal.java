
package tp8;

import tp8.Interfaces.PagoConDescuento;

public class Paypal implements PagoConDescuento{
    // implementamos pagoConDescuento
    @Override
    public double aplicarDescuento(double montoBase, double porcentaje){
        System.out.println("Se aplico descuento de: " + porcentaje + " % con Paypal");
        return montoBase * (1 - porcentaje / 100.0);
    }
    
    @Override
    public boolean procesarPago(double monto){
        System.out.println("El pago de $" + monto + " procesado con Paypal");
        return true;
    }
}
