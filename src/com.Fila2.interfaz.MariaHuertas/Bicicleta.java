//hola

public class Bicicleta extends Vehiculo{
    private String tipo;

    public Bicicleta(String marca, String modelo, String año) {
        super(marca, modelo, año);

    }

    @Override
    public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("Tipo: " + tipo);
    }

    public void tocarTimbre() {
        System.out.println("La bicicleta toca el timbre");
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}