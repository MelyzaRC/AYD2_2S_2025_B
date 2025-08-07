package state;

class ReproductorMusica {
    private Estado estado;

    public ReproductorMusica() {
    	
    	// CONDICIONES INICIALES
        this.estado = new EstadoDetenido();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void reproducir() {
        estado.reproducir();
        setEstado(new EstadoReproduciendo());
    }

    public void pausar() {
        estado.pausar();
        setEstado(new EstadoPausado());
    }

    public void detener() {
        estado.detener();
        setEstado(new EstadoDetenido());
    }
}