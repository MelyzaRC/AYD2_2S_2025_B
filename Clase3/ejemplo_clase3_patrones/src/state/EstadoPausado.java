package state;

class EstadoPausado implements Estado {
    @Override
    public void reproducir() {
        System.out.println("Reanudando música...");
    }

    @Override
    public void pausar() {
        System.out.println("La música ya está pausada.");
    }

    @Override
    public void detener() {
        System.out.println("Música detenida desde pausa.");
    }
}