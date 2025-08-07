package strategy;

public class PagoTarjeta implements EstrategiaPago {
    public void pagar(double cantidad) {
        System.out.println("Pagando Q" + cantidad + " con tarjeta");
    }
}
