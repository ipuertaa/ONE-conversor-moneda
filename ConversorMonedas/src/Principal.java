import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean salir = false;
        String monedaInicial = "";
        String monedaFinal = "";
        double valorUsuario = 0;

        ConsultaTasaCambio cambio = new ConsultaTasaCambio();

        Scanner lectura = new Scanner(System.in);

        while (!salir) {

            System.out.println("""

                    Bienvenido al conversor de monedas

                    1. COP a USD
                    2. COP a CAD
                    3. USD a COP
                    4. USD a CAD
                    5. CAD a COP
                    6. CAD a USD
                    7. Salir


                    Indique la opción que desea:
                    """);

            int opcionUsuario = lectura.nextInt();

            switch (opcionUsuario) {
                case 1:
                    monedaInicial = "COP";
                    monedaFinal = "USD";
                    System.out.println("Cantidad de pesos colombianos a convertir: ");
                    valorUsuario = lectura.nextFloat();

                    System.out.println(valorUsuario + " " + monedaInicial + " equivalen a "
                    + cambio.consultarAPI(monedaInicial, monedaFinal, valorUsuario) + " " +
                    monedaFinal);

                    break;

                case 2:
                    monedaInicial = "COP";
                    monedaFinal = "CAD";
                    System.out.println("Cantidad de pesos colombianos a convertir: ");
                    valorUsuario = lectura.nextFloat();

                    System.out.println(valorUsuario + " " + monedaInicial + " equivalen a "
                            + cambio.consultarAPI(monedaInicial, monedaFinal, valorUsuario) + " " + monedaFinal);
                    break;

                case 3:
                    monedaInicial = "USD";
                    monedaFinal = "COP";
                    System.out.println("Cantidad de dólares americanos a convertir: ");
                    valorUsuario = lectura.nextFloat();

                    System.out.println(valorUsuario + " " + monedaInicial + " equivalen a "
                            + cambio.consultarAPI(monedaInicial, monedaFinal, valorUsuario) + " " + monedaFinal);
                    break;

                case 4:
                    monedaInicial = "USD";
                    monedaFinal = "CAD";
                    System.out.println("Cantidad de dólares americanos a convertir: ");
                    valorUsuario = lectura.nextFloat();

                    System.out.println(valorUsuario + " " + monedaInicial + " equivalen a "
                            + cambio.consultarAPI(monedaInicial, monedaFinal, valorUsuario) + " " + monedaFinal);
                    break;

                case 5:
                    monedaInicial = "CAD";
                    monedaFinal = "COP";
                    System.out.println("Cantidad de dólares canadienses a convertir: ");
                    valorUsuario = lectura.nextFloat();

                    System.out.println(valorUsuario + " " + monedaInicial + " equivalen a "
                            + cambio.consultarAPI(monedaInicial, monedaFinal, valorUsuario) + " " + monedaFinal);

                    break;

                case 6:
                    monedaInicial = "CAD";
                    monedaFinal = "USD";
                    System.out.println("Cantidad de dólares canadienses a convertir: ");
                    valorUsuario = lectura.nextFloat();

                    System.out.println(valorUsuario + " " + monedaInicial + " equivalen a "
                            + cambio.consultarAPI(monedaInicial, monedaFinal, valorUsuario) + " " + monedaFinal);
                    break;

                case 7:
                    salir = true;
                    System.out.println("Conversión finalizada");
                    break;

                default:
                    System.out.println("Opción no válida, saliendo del programa");
                    salir = true;
                    break;

            }

        }

    }

}
