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
        System.out.println("Dime segundo número (1-100): ");
        num2 = sc.nextInt();

        //Intercambiamos si num1 es mayor que num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        while (num1 <= num2) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1++;
        }

    }
}
