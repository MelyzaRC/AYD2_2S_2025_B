package strategy;

public class strategy {
	public static void main(String[] args) {
        Caja caja = new Caja();

        caja.setEstrategia(new PagoPaypal());
        caja.procesarPago(100);

        caja.setEstrategia(new PagoTarjeta());
        caja.procesarPago(200);
    }
}
