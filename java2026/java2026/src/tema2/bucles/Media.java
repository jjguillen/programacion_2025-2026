package tema2.bucles;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        // Programa que pida números hasta que se introduzca un cero.
        // Debe imprimir la suma y la media de todos los números introducidos.

        //1. Bucle infinito
        //2. Ir pidiendo por teclado en cada iteración un número
        //3. Cuando el número sea igual a 0 -> termina el bucle (break)
        //4. En un acumulador guardar la suma de todos los números
        //5. Un contador (i) para saber cuántos números pido por teclado
        //6. Media = acumulador / contador

        int numero;
        int acumulador=0;
        int contador=0;
        double media;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Dime un número (0 para terminar): ");
            numero = sc.nextInt();

            if(numero == 0) {
                break;
            }

            acumulador += numero;
            contador++;
        }


        media = (double) acumulador / contador;
        System.out.println("Suma = " + acumulador);
        System.out.println("Media = " + media);

    }
}
