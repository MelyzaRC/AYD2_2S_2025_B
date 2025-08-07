package proxy;

public class ServidorReal implements Servidor {
    public void responderPeticion() {
        System.out.println("Respondiendo desde el servidor real.");
    }
}
