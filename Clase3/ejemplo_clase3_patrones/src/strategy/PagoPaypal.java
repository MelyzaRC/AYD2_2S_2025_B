package strategy;

public class PagoPaypal implements EstrategiaPago {
    public void pagar(double cantidad) {
        System.out.println("Pagando Q" + cantidad + " con PayPal");
    }
}
