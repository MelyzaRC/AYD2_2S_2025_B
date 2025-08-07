package proxy;

public class proxy {
	public static void main(String[] args) {
        Servidor servidor = new ServidorProxy(false);
        servidor.responderPeticion(); 

        servidor = new ServidorProxy(true);
        servidor.responderPeticion();
    }
}
