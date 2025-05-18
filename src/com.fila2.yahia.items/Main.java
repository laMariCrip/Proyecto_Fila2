import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce la marca del vehículo: ");
            String marca = sc.nextLine();
            System.out.print("Introduce el modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Introduce el año: ");
            String año = sc.nextLine();
            System.out.print("¿Qué tipo de vehículo es? ");
            String tipoVehiculo = sc.nextLine();

            if (tipoVehiculo.equalsIgnoreCase("Coche")) {
                System.out.println("Cuántas puertas tiene?");
                int cantidad = sc.nextInt();
                sc.nextLine();
                System.out.println("Tiene el aire acondicionado encendido (S/N)?");
                String aire = sc.nextLine();
                boolean encendido = false;
                if (aire.equalsIgnoreCase("S")) {
                    encendido = true;
                } else if (aire.equalsIgnoreCase("N")) {

                } else {
                    System.out.println("Opción no valida!");
                }
                Coche nuevoCoche = new Coche(marca, modelo, año, encendido);
                nuevoCoche.setNumeroPuertas(cantidad);
                nuevoCoche.MostrarInformacion();
                nuevoCoche.ActivarAireAcondicionado();
                nuevoCoche.Arrancar();
                if (nuevoCoche.getNumeroPuertas()>5) {
                    System.out.println("NO hay vehículos con tantas puertas!");
                }

            } else if (tipoVehiculo.equalsIgnoreCase("Moto") || tipoVehiculo.equalsIgnoreCase("Motocicleta")) {
                System.out.print("Escribe la cilindrada de la moto: ");
                double cilindrada = sc.nextDouble();
                sc.nextLine();
                Moto nuevamoto = new Moto(marca, modelo, año);
                nuevamoto.setCilindrada(cilindrada);
                nuevamoto.MostrarInformacion();
                nuevamoto.Arrancar();
                nuevamoto.hacerCaballito();
                if (nuevamoto.getCilindrada()>=500) {
                    System.out.println("Te has comprado un cohete!!");
                }

            } else if (tipoVehiculo.equalsIgnoreCase("Bicicleta") || (tipoVehiculo.equalsIgnoreCase("bici"))) {
                System.out.println("Introduce el tipo de bicicleta:");
                String tipoBibicleta = sc.nextLine();
                Bicicleta nuevaBicicleta = new Bicicleta(marca, modelo, año);
                nuevaBicicleta.setTipo(tipoBibicleta);
                nuevaBicicleta.MostrarInformacion();
                nuevaBicicleta.tocarTimbre();
                if (nuevaBicicleta.getTipo().equalsIgnoreCase("Paseo")) {
                    System.out.println("Te has comprado un petardo!!");
                }

            } else {
                System.out.println("Opción no valida!");
                return;
            }

        }while (true);
    }//end main
}