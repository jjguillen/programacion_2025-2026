package javat1.Examen1Hugo;

import java.util.Scanner;

public class Opcion2Ejercicio1 {
/*Adivina el Número con Pistas
El programa genera un número aleatorio entre 1 y 50. El usuario tiene un máximo de 7 intentos
para adivinarlo. Después de cada intento, el programa indicará:
– Si el número es mayor o menor
– Si está "frío" (diferencia > 10), "tibio" (dif. entre 5 y 10) o "caliente" (dif. < 5)
Al finalizar, mostrará si ganó o perdió y el número de intentos utilizados.*/


    public static void main(String[] args) {
        int Num = (int)(Math.random()*50) + 1;
        Scanner sc = new Scanner(System.in);
        int intentos = 7;
        int Numero;
        int IntentosUsados = 0;
        for (int i = 1; i <= intentos; i++) {
            System.out.println("Dime un numero");
            Numero = sc.nextInt();
            IntentosUsados++;
            if (Numero == Num) {
                System.out.println("Felicidades, has acertado el numero");
                System.out.println("Has usado " + IntentosUsados + " intentos");
                break;
            }
            if ((Num - Numero) < -10) {
                System.out.println("El numero es menor, Frio");
            } else if ((Num - Numero) <= -5 && (Num - Numero) >= -10) {
                System.out.println("El numero es menor, Tibio");
            } else if ((Num - Numero) > -5 && (Num - Numero) < 0) {
                System.out.println("El numero es menor, Caliente");
            } else if ((Num - Numero) < 5 ) {
                System.out.println("El numero es mayor, caliente");
            } else if ((Num - Numero) >= 5 && (Num - Numero) <= 10) {
                System.out.println("El numero es mayor, Tibio");
            } else if ((Num - Numero) > 10){
                System.out.println("El numero es mayor, Frio");
            }
            if (i == 7){
                System.out.println("Que lastima, te has quedado sin intentos");
                break;
            }
        }
    }
}
