package facade;

public class Computadora {
	private CPU cpu = new CPU();
    private Memoria memoria = new Memoria();
    private DiscoDuro disco = new DiscoDuro();

    public void encender() {
    	System.out.println("Iniciando computadora...");
        cpu.iniciar();
        memoria.cargar();
        disco.leer();
    }
}
