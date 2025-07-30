package d;

import o.MetodoPago;

public class ServicioPago {
    private MetodoPago metodoPago;

    public ServicioPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago(double monto) {
        metodoPago.pagar(monto);
    }
}