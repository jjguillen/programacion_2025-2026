package tema2.procedimientosYFunciones;

import java.util.Scanner;

public class CryptoBroConverter {

    public static void pintarOpciones() {
        System.out.println("1. Bitcoin");
        System.out.println("2. Ethereum");
        System.out.println("3. Dogecoin");
        System.out.println("4. XRP");
        System.out.println("5. Salir");
    }

    public static double convertir(int tipo, double cantidad) {
        switch (tipo) {
            case 1:
                return cantidad * 0.86 * 115375; //Bitcoin
            case 2:
                return cantidad * 0.86 * 4206; //Ethereum
            case 3:
                return cantidad * 0.86 * 0.2044; //Dogecoin
            case 4:
                return cantidad * 0.86 * 2.68; //XRP
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        //Hacer una aplicación que te permita saber cuántos euros son:
        //x monedas de una criptomoneda sabiendo su cambio:
        //1. Bitcoin -> 115375 dólares
        //2. Ethereum -> 4206 dólares
        //3. Dogecoin -> 0.2044 dólares
        //4. XRP -> 2.68 dólares
        //
        // Cambio 1 dólar -> 0.86 euros
        // El programa será un menú que te permita elegir el tipo de criptomoneda
        // luego te preguntará la cantidad de monedas (double) y te mostrará
        // el resultado en euros
        // Se valora el uso de funciones y control de excepciones

        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        double cantidad, euros;

        do {
            pintarOpciones();
            System.out.println("Elige opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.println("Dime la cantidad: ");
                cantidad = sc.nextDouble();

                euros = convertir(opcion, cantidad);
                System.out.println("El resultado es: " + euros + " euros");
            } else {
                System.out.println("Opción incorrecta");
            }

        } while (opcion != 5);

    }
}
