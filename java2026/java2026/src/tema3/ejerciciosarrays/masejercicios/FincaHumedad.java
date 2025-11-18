package tema3.ejerciciosarrays.masejercicios;

import java.util.Scanner;

public class FincaHumedad {


        /**
         * Una finca agrícola dispone de una serie de sensores de humedad del suelo distribuidos por diferentes zonas
         * del terreno. Cada sensor registra un valor entero entre 0 y 100.
         * Se pide implementar un programa en Java que trabaje con un array de valores de humedad, y que:
         * - Indique cuántos sensores están por debajo del nivel mínimo recomendado,
         * que será un valor dado por el usuario (por ejemplo, 30).
         * - Obtenga un nuevo array con los valores de los sensores que necesitan riego urgente.
         * - Calcule la media de humedad de toda la parcela.
         * - Determine si existe alguna zona crítica, definida como tres sensores consecutivos con
         * humedad menor al mínimo recomendado.
         *
         * Genera un array de ejemplo con 1000 valores aleatorios entre 0 y 100 para simular los sensores.
         */

        public static void pintar(double[] array) {
            for(int i=0; i < array.length; i++) {
                System.out.println((i+1) + " -> " + array[i]);
            }
        }

        /**
         * Cuenta cuántos elementos están por debajo del umbral minimo
         * @param humedades
         * @param minimo
         * @return
         */
        public static int contadorBajoNivel(double[] humedades, double minimo) {
            int contador = 0;
            for(int i=0; i < humedades.length; i++) {
                if (humedades[i] < minimo)
                    contador++;
            }
            return contador;
        }

        /**
         * Devuelve la media de humedades de la finca
         * Divide la suma de las humedades por el tamaño del array
         * @param humedades
         * @return
         */
        public static double mediaHumedades(double[] humedades) {
            double acumulador = 0;
            for(int i=0; i < humedades.length; i++) {
                acumulador += humedades[i];
            }
            return acumulador / humedades.length;
        }

    /**
     * Devuelve un array con los valores de los sensores que necesitan riego urgente.
     * El tamaño del array corresponde con el número de sensores por debajo del umbral.
     * @param humedades
     * @param minimo
     * @return
     */
    public static double[] valoresPorDebajo(double[] humedades, double minimo) {
            //Calculamos el tamaño del array de valores por debajo del umbral
            int sizeMinimo=0;
            for(int i=0; i < humedades.length; i++) {
                if (humedades[i] < minimo)
                    sizeMinimo++;
            }

            //Crear array de mínimos
            double[] minimos = new double[sizeMinimo];
            int contador=0;
            for(int i=0; i < humedades.length; i++) {
                if (humedades[i] < minimo) {
                    minimos[contador] = humedades[i];
                    contador++;
                }
            }

            return minimos;
        }

        /**
         * Función que determina si hay tres valores de humedades consecutivos por debajo del umbral
         * @param humedades
         * @param minimo
         * @return
         */
        public static boolean hayZonaCritica(double[] humedades, double minimo) {
            for(int i=0; i < humedades.length - 2; i++) {
                if (humedades[i] < minimo &&
                    humedades[i+1] < minimo &&
                    humedades[i+2] < minimo) {
                    return true;
                }
            }

            return false;
        }

        public static void main(String[] args) {
            double[] humedades = new double[10];
            double mediaHumedad = 0;
            int contadorCriticos = 0;
            int contadorBajo = 0;
            double nivelMinimo = 30;
            Scanner sc = new Scanner(System.in);

            //Rellenar con valores aleatorios
            for(int i=0; i < humedades.length; i++) {
                humedades[i] = Math.random() * 100;
            }

            //Pintar array de humedades
            pintar(humedades);

            //Pedir umbral
            do {
                System.out.println("Dime el umbral de humedad mínimo (0-99): ");
                try {
                    nivelMinimo = Double.parseDouble(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("No has introducido un número");
                    nivelMinimo = -1;
                }
            } while (nivelMinimo < 0 || nivelMinimo > 99);

            System.out.println("El umbral mínimo de humedad es " + nivelMinimo);

            //Elementos por debajo del umbral
            contadorBajo = contadorBajoNivel(humedades, nivelMinimo);
            System.out.println("Hay " + contadorBajo + " elementos por debajo del umbral");

            //Media de humedades
            mediaHumedad = mediaHumedades(humedades);
            System.out.println("La media de humedades es " + mediaHumedad);

            //Elementos por debajo del umbral
            double[] valoresPorDebajo = valoresPorDebajo(humedades, nivelMinimo);
            pintar(valoresPorDebajo);

            //Comprobar si hay tres valores por debajo del umbral consecutivos
            boolean zonaCritica = hayZonaCritica(humedades, nivelMinimo);
            if (zonaCritica) {
                System.out.println("Hay zona crítica con al menos tres valores por debajo del umbral consecutivos");
            } else {
                System.out.println("No hay zona crítica por debajo del umbral");
            }

    }
}
