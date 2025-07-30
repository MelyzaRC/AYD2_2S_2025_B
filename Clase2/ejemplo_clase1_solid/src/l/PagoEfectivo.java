package l;

import o.MetodoPago;

public class PagoEfectivo implements MetodoPago{

	public void pagar(double monto) {
        System.out.println("Pagando Q." + monto + " con el método de pago EFECTIVO.");
    }
	
}
