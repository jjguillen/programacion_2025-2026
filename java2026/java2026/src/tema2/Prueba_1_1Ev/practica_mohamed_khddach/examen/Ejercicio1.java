package tema2.examen;

import java.util.Scanner;

public class Ejercicio1 {

    // function: genera un número aleatorio entre 1 y 50
    public static int aleatorio() {
        //variables
        int resultado;

        resultado = (int) (Math.random() * 50) + 1;
        return resultado;
    }

    // procedure jugar: Adivina el Número con Pistas
    public static void game() {

        //variables
        int contador = 0;
        int num = 0, numRandom;
        Scanner sc = new Scanner(System.in);


        // genera un número aleatorio entre 1 y 50
        numRandom = aleatorio();

        while (true) {

            if (contador > 7) {
                System.out.println("game over");
                break;
            }


            try {
                System.out.print("Dime la numero: ");
                num = sc.nextInt();

            } catch (Exception e) {
                System.out.println("escribe la numero solo");
                sc = new Scanner(System.in);
                continue;
            }



            if (num > 10) {
                System.out.println("frío");

            } else if (num >= 5 && num <= 10) {
                System.out.println("tibio");
            } else {
                System.out.println("caliente");
            }


            if (num == numRandom) {
                System.out.println("usuario es ganó");
                System.out.println("adivinarlo es " + contador);
                break;
            } else {
                System.out.println("adivinarlo es " + (7-contador));
            }


            contador++;

        }


    }

    public static void main(String[] args) {

        /*
            OPCIÓN 2
            Adivina el Número con Pistas El programa genera un número aleatorio entre 1 y 50. El usuario tiene un máximo de 7 intentos
            para adivinarlo. Después de cada intento, el programa indicará:
            – Si el número es mayor o menor
            – Si está "frío" (diferencia > 10), "tibio" (dif. entre 5 y 10) o "caliente" (dif. < 5)

            Al finalizar, mostrará si ganó o perdió y el número de intentos utilizados.
         */


        //variables
        int opcion = -1;

        Scanner sc = new Scanner(System.in);

        do {

            try {
                System.out.println("1. Jugar start");
                System.out.println("0. Salir opción");
                System.out.println("---------------------");

                System.out.print("Dime una opción : ");
                opcion = sc.nextInt();

            } catch (Exception e) {
                System.out.println("escribe la numero solo");
                sc = new Scanner(System.in);
                continue;
            }


            switch (opcion){
                case 1:
                    game();
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }


        } while (opcion != 0);

    }
}
