package state;

public class state {
	public static void main(String[] args) {
		ReproductorMusica reproductor = new ReproductorMusica();
		
		reproductor.pausar();
		reproductor.detener();
		reproductor.reproducir();
		reproductor.pausar();
		reproductor.reproducir();
		reproductor.detener();
		
	}
}
