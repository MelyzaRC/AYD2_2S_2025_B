package s;

public class ProcesadorPagos {
    public void procesar(Pago pago) {
        System.out.println("Procesando pago de Q." + pago.getMonto());
    }
}