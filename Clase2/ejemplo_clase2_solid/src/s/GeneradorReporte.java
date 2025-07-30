package s;

public class GeneradorReporte {
    public void generarReporte(Pago pago) {
        System.out.println("Reporte generado para pago de Q." + pago.getMonto());
    }
}