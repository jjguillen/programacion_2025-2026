package examen;

import java.util.Scanner;

public class opcion2Ejercicio1 {
    public static void main(String[] args) {

        //El programa genera un número aleatorio entre 1 y 50. El usuario tiene un máximo de 7 intentos
        //para adivinarlo. Después de cada intento, el programa indicará:
        //– Si el número es mayor o menor
        //– Si está "frío" (diferencia > 10), "tibio" (dif. entre 5 y 10) o "caliente" (dif. < 5)
        //Al finalizar, mostrará si ganó o perdió y el número de intentos utilizados.


        int numero = 0;
        int numeroAleatorio = 0;
        int diferencia = 0;
        int contador = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entre el 1 y 50: " );
        System.out.println("Tienes 7 intentos");
        numeroAleatorio = (int) (Math.random() * 50 ) + 1;
        try {

            for (int i = 6; i >= 0; i--) {

                numero = sc.nextInt();
                if (numero > 50 || numero < 1){
                    System.out.println("Numero incorrecto, vuelve a intentarlo");
                    return;
                }
                if (numero > numeroAleatorio) {
                    diferencia = numero - numeroAleatorio;
                    System.out.println("El numero es menor al indicado " + i + " intentos restantes");
                } else if (numero < numeroAleatorio) {
                    diferencia = numeroAleatorio - numero;
                    System.out.println("El numero es mayor al indicado " + i + " intentos restantes");
                } else if (numero == numeroAleatorio) {
                    System.out.println("Has acertado el numero");
                    System.out.println("Numero de intentos utilizados " + contador);
                    return;
                }
                if (i == 0) {
                    System.out.println("Has perdido lo siento");
                    return;
                }
                if (diferencia > 10) {
                    System.out.println("Frio");
                } else if (diferencia > 5 && diferencia <= 10) {
                    System.out.println("Tibio");
                } else if (diferencia <= 5) {
                    System.out.println("Caliente");
                }
                contador++;
                diferencia = 0;
            }

        } catch (Exception exc) {
            System.out.println("Error leyendo de teclado");
        }







    }
}
