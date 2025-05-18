public class Moto extends Vehiculo{
    private double cilindrada;

    public Moto(String marca, String modelo, String año) {
        super(marca, modelo, año);
    }

    @Override
    public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada);
    }

    public void hacerCaballito() {
        System.out.println("Esta moto sabe hacer caballitos");
    }

    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}