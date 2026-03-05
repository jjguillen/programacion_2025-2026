package tema2.repaso;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        /*
        Programa que lea dos números positivos e imprima por pantalla todos los
        números pares que estén entre los dos números dados. También debe indicar
        cuántos números pares hay en ese intervalo.
         */


        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int contadorPares=0;

        try {
            System.out.println("Dime el primer número");
            num1 = Integer.parseInt(sc.nextLine()); //Pasa (String) "4" a  (int) 4
            System.out.println("Dime el segundo número");
            num2 = Integer.parseInt(sc.nextLine());

            //Intercambiar num1 y num2 si num2 es más pequeño que num1
            if (num2 < num1) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    contadorPares++;
                }
            }
        } catch (Exception exc) {
            System.out.println("Error leyendo de teclado");
        }


        System.out.println("El número total de pares es " + contadorPares);



    }
}
