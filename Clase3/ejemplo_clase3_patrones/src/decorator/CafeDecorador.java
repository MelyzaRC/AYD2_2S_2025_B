package decorator;

public abstract class CafeDecorador implements Cafe {
    protected Cafe cafe;
    public CafeDecorador(Cafe cafe) { this.cafe = cafe; }
}