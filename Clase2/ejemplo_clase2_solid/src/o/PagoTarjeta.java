package o;

public class PagoTarjeta implements MetodoPago {

	@Override
	public void pagar(double monto) {
		// TODO Auto-generated method stub
		System.out.println("Pagando Q." + monto + " con el método de pago TARJETA.");
	}

}
