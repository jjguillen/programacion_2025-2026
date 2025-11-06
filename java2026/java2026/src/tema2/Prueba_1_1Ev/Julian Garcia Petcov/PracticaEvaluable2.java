package Tema1;

import java.util.Scanner;

public class PracticaEvaluable2 {
    public static void main(String[] args) {

        // Opción 1
        // Calculadora de Propiedades Numeicas


        //1. Mostrar la tabla de multiplicar de ese numero (del 1 al 10)
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime um numero");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(num + "x" + i + " = " + num*i);
        }

        //2. Calcular el factorial del  número

        int  acumulador = 1;

        System.out.println("Diga un numero:");
        num = sc.nextInt();

        acumulador = 1;
        for(int i = 1; i <= num; i++){
            acumulador = acumulador * num;
        }
        System.out.println("El Factorial de " + num + " es: " + acumulador);

        //3. Mostrar todos los divisores del numeros

        int  divisor = num;

        for (int i = 2; i <= num -1; i++){
            if (divisor % i ==0){
                System.out.println( i + " Sus divisores " );
            }
        }


    }
}
