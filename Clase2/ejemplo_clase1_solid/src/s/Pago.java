package s;

public class Pago {
    private double monto;

    public Pago(double monto) {
    	System.out.println("Creación de pago");
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
    
    public void setMonto(double monto_) {
    	monto = monto_;
    }
}