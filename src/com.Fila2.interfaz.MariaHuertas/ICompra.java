package model.interfaces;

public interface ICompra {
    /*permite al usuario agregar productos a una lista de compra,
    calcular el total de la compra y generar un ticket con formato legible para el cliente.*/

    void agregarALista(String nombre, double precio);

    void calcularTotal();

    void generarLista();

    void generarTicket();
}