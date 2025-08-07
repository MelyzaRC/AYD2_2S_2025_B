package state;

class EstadoReproduciendo implements Estado {
    @Override
    public void reproducir() {
        System.out.println("Ya se está reproduciendo la música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void detener() {
        System.out.println("Música detenida.");
    }
}