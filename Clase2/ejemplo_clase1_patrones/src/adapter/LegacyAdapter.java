package adapter;

public class LegacyAdapter implements AudioPlayer {
    private LegacyPlayer legacyPlayer;

    public LegacyAdapter(LegacyPlayer legacyPlayer) {
        this.legacyPlayer = legacyPlayer;
    }

    @Override
    public void play(String filename) {
        legacyPlayer.reproducirArchivo(filename);
    }
}