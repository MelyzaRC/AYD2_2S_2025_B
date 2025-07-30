package d;

import o.MetodoPago;
import o.PagoTarjeta;

public class d {

	public static void main(String[] args) {

		System.out.println("___________________________________\n");
		System.out.println("D – Dependency Inversion Principle");
		System.out.println("___________________________________\n");


		MetodoPago metodo = new PagoTarjeta(); 
        ServicioPago servicio = new ServicioPago(metodo);
        servicio.realizarPago(150.0);
	}

}
