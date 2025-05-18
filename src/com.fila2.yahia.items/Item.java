package com.fila2.yahia.items;
// Esta es la clase Item

public abstract class Item {
    protected String nombre;
    protected String descripcion;

    public Item(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
// He añadido otro comentario en Item.java
    public abstract void usar();

    public String descripcionCorta() {
    return nombre + " - " + descripcion;
}

}
