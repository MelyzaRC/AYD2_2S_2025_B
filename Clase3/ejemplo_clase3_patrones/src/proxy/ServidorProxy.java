package proxy;

public class ServidorProxy implements Servidor {
    private ServidorReal servidorReal;
    private boolean autorizado;

    public ServidorProxy(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public void responderPeticion() {
        if (!autorizado) {
            System.out.println("Acceso denegado.");
            return;
        }
        if (servidorReal == null) servidorReal = new ServidorReal();
        servidorReal.responderPeticion();
    }
}
