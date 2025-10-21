package tema2.bucles;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        //Programa que pida un número por teclado y muestre su tabla
        //de multiplicar
        //Ejemplo: 7
        //7x1 = 7
        //7x2 = 14
        //7x3 = 21
        //7x4 = 28
        //7x5 = 35
        //7x6 = 42
        //7x7 = 49
        //7x8 = 56
        //7x9 = 63
        //7x10 = 70

        //1. Pedir un número teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número entero: ");
        int numero = sc.nextInt();

        //2. Bucle de 1 a 10
        for(int i=1; i <= 10; i++) {
            System.out.println(numero + "x" + i + " = " + (numero * i));
        }


        //TODAS LAS TABLAS DE MULTIPLICAR DEL 1 AL 10
        for(int j=1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(j + "x" + i + " = " + (j * i));
            }
        }


    }
}
