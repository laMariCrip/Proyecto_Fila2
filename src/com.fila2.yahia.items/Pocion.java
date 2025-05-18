package com.fila2.yahia.items;
// Clase para las pociones del juego

public class Pocion extends Item {
    private int puntosCuracion;

    public Pocion(String nombre, String descripcion, int puntosCuracion) {
        super(nombre, descripcion);
        this.puntosCuracion = puntosCuracion;
    }

    @Override
    public void usar() {
        System.out.println("Has usado " + nombre + " y recuperas " + puntosCuracion + " puntos de vida.");

    }
}
