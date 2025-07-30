package l;

import o.PagoTarjeta;
import o.PagoTransferencia;
import o.MetodoPago;

public class l {
	public static void main(String[] args) {

		System.out.println("___________________________________\n");
		System.out.println("L – Liskov Substitution Principle");
		System.out.println("___________________________________\n");

		double monto = 100;
		MetodoPago pagoEfectivo = new PagoEfectivo();
		MetodoPago pagoTransferencia = new PagoTransferencia();
		MetodoPago pagoTarjeta = new PagoTarjeta(); 
		
		ProcesadorLiskov procesadorLiskov = new ProcesadorLiskov();
		procesadorLiskov.procesar(pagoEfectivo, monto);
		procesadorLiskov.procesar(pagoTransferencia, monto);
		procesadorLiskov.procesar(pagoTarjeta, monto);

	}
}
