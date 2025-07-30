package s;

public class s {

	
	public static void main(String[] args) {

		System.out.println("___________________________________\n");
		System.out.println("S - Single Responsability");
		System.out.println("___________________________________\n");

		Pago pago = new Pago(100);

		ProcesadorPagos procesadorPagos = new ProcesadorPagos();
		procesadorPagos.procesar(pago);

		GeneradorReporte generadorReporte = new GeneradorReporte();
		generadorReporte.generarReporte(pago);
	}
}
