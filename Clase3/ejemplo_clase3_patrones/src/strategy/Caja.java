package strategy;

public class Caja {
    private EstrategiaPago estrategia;

    public void setEstrategia(EstrategiaPago estrategia) {
        this.estrategia = estrategia;
    }

    public void procesarPago(double cantidad) {
        estrategia.pagar(cantidad);
    }
}