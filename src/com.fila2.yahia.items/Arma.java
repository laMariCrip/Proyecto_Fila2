package com.fila2.yahia.items;
// Esta clase representar a las armas del juego
public class Arma extends Item {
    private int dano;

    public Arma(String nombre, String descripcion, int dano) {
        super(nombre, descripcion);
        this.dano = dano;
    }

    

    @Override
    public void usar() {
        System.out.println("Atacas con " + nombre + " causando " + dano + " puntos de daño.");
    }
}