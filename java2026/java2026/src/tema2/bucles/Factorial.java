package tema2.bucles;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //    Crea una programa que pida un número y calcule su factorial
        //    El factorial de un número es el producto de todos los enteros
        //    entre 1 y el propio número y se representa por el número seguido
        //    de un signo de exclamación. Por ejemplo 5! = 1x2x3x4x5 = 120
        //    7! = 1x2x3x4x5x6x7 = 5040

        // Acumulador
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Dime un número: ");
        numero = sc.nextInt();

        //Calcula el factorial de numero
        int acumulador = 1;
        for(int i=2; i <= numero; i++) {
            acumulador = acumulador * numero;
        }

        System.out.println("El factorial de " + numero + " es: " + acumulador);

    }
}
