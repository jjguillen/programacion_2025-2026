package tema2.repaso;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        /*
        Programa que lea por teclado una serie de números enteros hasta que
        introduzca el -1 y obtenga su media. Deberá mostrarla por pantalla.
         */

        double media=0; // acumulado / numero de elementos
        int numero=0, acumulador=0, contador=0;

        Scanner sc = new Scanner(System.in);

        while (numero != -1) {
            System.out.println("Introduce número: ");
            numero = Integer.parseInt(sc.nextLine());

            if (numero == -1) {
                break;
            }

            acumulador += numero;
            contador++;


        }

        media = (double) acumulador / contador;
        System.out.println("La media es: " + media);


    }
}
