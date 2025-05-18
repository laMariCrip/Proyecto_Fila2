public class Coche extends Vehiculo{
    private int numeroPuertas;
    boolean aireAcondicionado;

    public Coche(String marca, String modelo, String año, boolean aireAcondicionado) {
        super(marca, modelo, año);
        this.aireAcondicionado = aireAcondicionado;
    }

    public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("Tiene " + numeroPuertas + " puertas.");
    }

    public void ActivarAireAcondicionado() {
        if (aireAcondicionado==true) {
            System.out.println("El aire está puesto");
        } else {
            aireAcondicionado=true;
            System.out.println("Se acaba de activar el aire");
        }
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}