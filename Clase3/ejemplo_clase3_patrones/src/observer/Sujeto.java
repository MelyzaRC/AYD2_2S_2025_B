package observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    private List<Observador> observadores = new ArrayList<>();

    public void agregar(Observador o) {
        observadores.add(o);
    }

    public void notificar(String mensaje) {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }
}