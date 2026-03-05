package tema2.bucles;

import java.util.Scanner;

public class EjercicioBucles8 {
    public static void main(String[] args) {

        //Pide 10 palabras por teclado y dime cuántas de ellas
        //tienen longitud mayor de 5 caracteres
        //cadena.length() devuelve la longitud de la cadena

        String palabra = "Hola";
        System.out.println(palabra.length());

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int num;

        for(num=1; num <= 10; num++) {
            System.out.println("Dime la palabra " + num);
            palabra = sc.nextLine();
            System.out.println(palabra + " -> " + palabra.length());
            if (palabra.length() > 5) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " palabras de longitud mayor de 5 caracteres");


        /*
        //Con bucle while
        while (num <= 10) { //Condición del bucle
            //Sentencias
            System.out.println("Dime la palabra " + num);

            //Incremento del bucle
            num++;
        }

        //Con bucle do-while
        num = 1;
        do {
            System.out.println("Dime la palabra " + num);
            num++;
        } while (num <= 10);
         */

    }
}
