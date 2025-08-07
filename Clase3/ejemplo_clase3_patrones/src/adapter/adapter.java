package adapter;

public class adapter {
	public static void main(String[] args) {
        AudioPlayer moderno = new ModernPlayer();
        moderno.play("cancion_moderno.mp3");

        LegacyPlayer legacy = new LegacyPlayer();
        AudioPlayer adaptado = new LegacyAdapter(legacy);
        adaptado.play("cancion_legacy.mp3");
    }
}
