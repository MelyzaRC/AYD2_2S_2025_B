package o;

import s.Pago;

public class o {

	public static void main(String[] args) {

		System.out.println("___________________________________\n");
		System.out.println("O – Open/Closed Principle ");
		System.out.println("___________________________________\n");

		Pago pago = new Pago(100);

		MetodoPago pagoTarjeta = new PagoTarjeta();
		pagoTarjeta.pagar(pago.getMonto());

		MetodoPago pagoTransferencia = new PagoTransferencia();
		pagoTransferencia.pagar(pago.getMonto());

	}

}
