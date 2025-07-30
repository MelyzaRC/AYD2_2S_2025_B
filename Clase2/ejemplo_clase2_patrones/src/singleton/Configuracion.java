package singleton;

public class Configuracion {

    private static Configuracion instancia;
    private int numero; 

    private Configuracion() {
        System.out.println("Configuración inicializada");
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion(); 
        }
        return instancia;
    }

    public void mostrarConfiguracion() {
        System.out.println("Mostrando configuración...");
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }
}
