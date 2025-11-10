package tema2.Prueba_1_1Ev.practica_mohamed_khddach;

import java.util.Scanner;

public class Ejer1_Opc2 {

    /**
     * El programa genera un número aleatorio entre 1 y 50. El usuario tiene un máximo de 7 intentos
     * para adivinarlo. Después de cada intento, el programa indicará:
     * – Si el número es mayor o menor
     * – Si está "frío" (diferencia > 10), "tibio" (dif. entre 5 y 10) o "caliente" (dif. < 5)
     * Al finalizar, mostrará si ganó o perdió y el número de intentos utilizados.
     */

    /**
     * Genera número aleatorio entre 1 y max
     * @param max
     * @return
     */
    public static int generarAleatorio(int max) {
        return (int) (Math.random() * max + 1);
    }

    /**
     * Función que pide al usario un número entre 1 y 50
     * Si da error de teclado o lo escribe fuera de rango, se vuelve a pedir
     * @return
     */
    public static int probarNumero() {
        int numero=-1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Escribe número (1-50)");
            try {
                numero = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                System.out.println("Número incorrecto");
            }
        } while (numero < 1 || numero > 50);

        return numero;
    }

    /**
     * Función que calcula el valor absoluto de un entero
     * @param numero
     * @return
     */
    public static int valorAbsoluto(int numero) {
        if (numero < 0)
            return -numero;
        else
            return numero;
    }

    public static void main(String[] args) {

        int intentos=7;
        int numeroAAdivinar=generarAleatorio(50);

        //Quitar luego
        //System.out.println("El número a adivinar es: " + numeroAAdivinar);

        int diferencia;
        int num;

        //Mientras tengamos intentos pues probamos
        for(intentos = 7; intentos > 0; intentos--) {
            num = probarNumero();
            diferencia = valorAbsoluto(num - numeroAAdivinar);

            //Primero decirle si es mayor o menor
            if (numeroAAdivinar > num) {
                System.out.println("El número a adivinar es mayor");
            } else if (numeroAAdivinar < num) {
                System.out.println("El número a adivinar es menor");
            } else {
                System.out.println("Has acertado");
                break;
            }

            //Luego decirle si está frío, tibio o caliente
            if (diferencia > 10) {
                System.out.println("Frío frío");
            } else if (diferencia >= 5 && diferencia <= 10) {
                System.out.println("Tibio");
            } else if (diferencia < 5) {
                System.out.println("Caliente");
            }

            //intentos--;
        }

        if (intentos == 0) {
            System.out.println("Has perdido");
        } else {
            System.out.println("Has ganado");
        }

    }
}
