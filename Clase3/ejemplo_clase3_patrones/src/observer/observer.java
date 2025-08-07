package observer;

public class observer {
	  public static void main(String[] args) {
	        Sujeto canal = new Sujeto();

	        canal.agregar(new Usuario("Ana"));
	        canal.agregar(new Usuario("Pedro"));

	        canal.notificar("Nuevo video publicado");
	    }
}
