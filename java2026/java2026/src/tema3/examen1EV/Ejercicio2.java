package tema3.examen1EV;

import java.util.Arrays;

public class Ejercicio2 {
    public static int TIRADAS = 20;
    public static int CARAS = 8;

    /**
     * Recibe una array con todas las tiradas efectuadas
     * Devuelve un array de 8 posiciones donde indica el elemento
     * en la posición i, significa si ha salido la cara (i+1) o no:
     * - las caras que salen (i+1) tienen un 1 como valor
     * - las caras que no salen (i+1) tienen un -1 como valor
     * @param tiradas
     * @return
     */
    public static int[] carasNoSalidas(int[] tiradas) {
        int[] carasNoSalidas = new int[CARAS];

        Arrays.fill(carasNoSalidas, -1);
        for (int i = 0; i < tiradas.length; i++) {
            for (int j = 0; j < CARAS; j++) {
               if (tiradas[i] == (j+1)) {
                    carasNoSalidas[j] = 1;
                }
            }
        }

        return carasNoSalidas;
    }

    /**
     * El array que recibe es el número de veces que sale cada cara
     * @param vecesCara
     * @return
     */
    public static int[] carasNoSalidas2(int[] vecesCara) {
        int[] carasNoSalidas = new int[CARAS];
        int index = 0;

        Arrays.fill(carasNoSalidas, -1);
        for (int i = 0; i < vecesCara.length; i++) {
            if (vecesCara[i] == 0) {
                carasNoSalidas[index] = (i+1);
                index++;
            }
        }

        return carasNoSalidas;
    }

    public static double porcentajeParejasConsecutivas(int[] tiradas) {
        double valor=0;
        int consecutivas=0;
        int anterior = tiradas[0];
        for(int i=1;i<tiradas.length;i++){
            if(tiradas[i] == anterior){
                consecutivas++;
            }
            anterior = tiradas[i];
        }
        //System.out.println(consecutivas);
        return  ((double) consecutivas / tiradas.length) * 100.0;
    }

    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        int tirada, mayor, caraMayor;
        int acumulador = 0;
        int[] numeroVecesCara = new int[CARAS];
        int[] tiradas = new int[TIRADAS];

        for(int i=0; i < TIRADAS; i++) {
            //Realizar tirada
            tirada = generarAleatorio(1, CARAS);
            //System.out.println(tirada);
            //Guardamos la tirada para luego ver las consecutivas
            tiradas[i] = tirada;
            //Incrementamos el contador de la cara correspondiente
            numeroVecesCara[tirada-1]++; //3 numeroVecesCara[2]++
            //Acumulamos para luego sacar la media
            acumulador += tirada;
        }

        mayor = numeroVecesCara[0];
        caraMayor = 0;
        for(int i=0; i < CARAS; i++) {
            //Vamos sacando el mayor valor y la cara
            if (numeroVecesCara[i] > mayor) {
                mayor = numeroVecesCara[i];
                caraMayor = i;
            }
            //Le sumamos 1 a la cara, pues lo tenemos del 0 a CARAS-1
            System.out.println("La cara " + (i+1) + " ha salido " +
                    numeroVecesCara[i]);
        }
        System.out.println("La cara que más veces sale es " + (caraMayor + 1));
        System.out.println("La media de las tiradas es: " + ((double)acumulador / TIRADAS));

        System.out.printf("El porcentaje de repetidas consecutivas es: %.2f %%", porcentajeParejasConsecutivas(tiradas));

        System.out.println();
        System.out.println("Las caras que no han salido son: ");
        int[] carasNoSalidas = carasNoSalidas(tiradas);
        for(int i=0; i < carasNoSalidas.length; i++ ) {
            if (carasNoSalidas[i] == -1) {
                System.out.println(" - La cara " + (i+1) + " no ha salido");
            }
            //System.out.println(carasNoSalidas[i]);
        }

        //Otra versión pasándole el array donde pone las veces que sale cada cara
        System.out.println("----------------------------------------------");
        System.out.println("Las caras que no han salido son: ");
        carasNoSalidas = carasNoSalidas2(numeroVecesCara);
        for(int i=0; i < carasNoSalidas.length; i++ ) {
            if (carasNoSalidas[i] != -1) {
                System.out.println(" - La cara " + (carasNoSalidas[i]) + " no ha salido");
            }
            //System.out.println(carasNoSalidas[i]);
        }

    }
}
