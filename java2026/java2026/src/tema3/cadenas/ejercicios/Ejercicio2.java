package tema3.cadenas.ejercicios;

public class Ejercicio2 {

    public static void main(String[] args) {

        /**
         * Compara estos dos Strings sin tener en cuenta mayúsculas:
         * "Esta tarde no voy", "esta tarde no VOY".
         */

        String cad1 = "Esta tarde no voy";
        String cad2 = "esta tarde no VOY";

        if (cad1.toLowerCase().equals(cad2.toLowerCase())) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        //equalsIgnoreCase --> compara dos cadenas ignorando mayúsculas/minúsculas
        if (cad1.equalsIgnoreCase(cad2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }
}
