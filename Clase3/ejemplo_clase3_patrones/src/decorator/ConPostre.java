package decorator;

public class ConPostre extends CafeDecorador {
    public ConPostre(Cafe cafe) { super(cafe); }

    public String descripcion() { return cafe.descripcion() + ", con postre"; }
    public double costo() { return cafe.costo() + 15; }
}