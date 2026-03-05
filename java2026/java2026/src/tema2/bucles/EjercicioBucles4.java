package tema2.bucles;

import java.util.Scanner;

public class EjercicioBucles4 {
    public static void main(String[] args) {
        //Pide dos números por teclado entre 1 y 100
        //Muestra los números pares entre esos dos números
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime primer número (1-100): ");
        num1 = sc.nextInt();

        //Asegurarme que num2 es mayor que num1
        do {
            System.out.println("Dime segundo número mayor que el anterior: ");
            num2 = sc.nextInt();
        } while (num2 <= num1);

        /*
        //O asegurarme intercambiando valores si num2 es menor que num1
        if (num2 < num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        */

        int contador = num1;
        while (contador <= num2) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;
        }

    }
}
