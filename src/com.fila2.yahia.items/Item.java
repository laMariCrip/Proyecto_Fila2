package com.fila2.yahia.items;

public abstract class Item {
    protected String nombre;
    protected String descripcion;

    public Item(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    

    public abstract void usar();

    public String descripcionCorta() {
    return nombre + " - " + descripcion;
}

}
