package l;

import o.MetodoPago;

public class ProcesadorLiskov {
	 public void procesar(MetodoPago metodo, double monto) {
	        metodo.pagar(monto);
	    }
}
