package tema2.bucles;

import java.util.Scanner;

public class Repaso2 {
    public static void main(String[] args) {
        // Realizar un algoritmo que pida números (se pedirá por teclado la
        // cantidad de números a introducir). El programa debe informar de
        // cuantos números introducidos son mayores que 0,
        // menores que 0 (e iguales a 0)

        Scanner sc = new Scanner(System.in);
        int numero;
        int num;
        int contadorMayores=0;
        int contadorMenores=0;
        int contadorIguales=0;

        System.out.println("Dime cuántos números vas a introducir: ");
        numero = sc.nextInt();

        for(int i=0; i < numero; i++) {
            System.out.println("Introduce número: ");
            num = sc.nextInt();

            if(num > 0) {
                contadorMayores++;
            } else if(num < 0) {
                contadorMenores++;
            } else {
                contadorIguales++;
            }
        }

        System.out.println("Mayores: " + contadorMayores);
        System.out.println("Menores: " + contadorMenores);
        System.out.println("Iguales: " + contadorIguales);


    }
}
