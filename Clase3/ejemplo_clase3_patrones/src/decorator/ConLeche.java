package decorator;

public class ConLeche extends CafeDecorador {
    public ConLeche(Cafe cafe) { super(cafe); }

    public String descripcion() { return cafe.descripcion() + ", con leche"; }
    public double costo() { return cafe.costo() + 5; }
}