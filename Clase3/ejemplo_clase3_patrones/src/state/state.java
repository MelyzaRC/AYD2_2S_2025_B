package state;

public class state {
	public static void main(String[] args) {
		ReproductorMusica reproductor = new ReproductorMusica();

		reproductor.reproducir();
		reproductor.pausar();
		reproductor.reproducir();
		reproductor.detener();
		
	}
}
