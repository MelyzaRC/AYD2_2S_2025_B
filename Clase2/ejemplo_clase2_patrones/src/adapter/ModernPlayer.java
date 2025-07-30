package adapter;

public class ModernPlayer implements AudioPlayer {
    public void play(String filename) {
        System.out.println("Reproduciendo audio moderno: " + filename);
    }
}