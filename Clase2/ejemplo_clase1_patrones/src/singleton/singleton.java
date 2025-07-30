package singleton;

public class singleton {
	public static void main(String[] args) {
		
        Configuracion config1 = Configuracion.getInstancia();
        config1.setNumero(1000);
        config1.mostrarConfiguracion();

        Configuracion config2 = Configuracion.getInstancia();
        System.out.println(config2.getNumero());
        System.out.println(config1 == config2); 
    }
}
