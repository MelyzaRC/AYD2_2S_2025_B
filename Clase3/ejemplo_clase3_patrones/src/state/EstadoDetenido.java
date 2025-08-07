package state;

class EstadoDetenido implements Estado {
    @Override
    public void reproducir() {
        System.out.println("Iniciando reproducción...");
    }

    @Override
    public void pausar() {
        System.out.println("No se puede pausar, la música está detenida.");
    }

    @Override
    public void detener() {
        System.out.println("La música ya está detenida.");
    }
}