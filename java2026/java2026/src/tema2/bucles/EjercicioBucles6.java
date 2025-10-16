package tema2.bucles;

import java.util.Scanner;

public class EjercicioBucles6 {
    public static void main(String[] args) {

        //Pide un número entero por teclado y di cuántos dígitos tiene
        Scanner sc = new Scanner(System.in);
        long numero;
        long contador;

        System.out.println("Dime un número entero: ");
        numero = sc.nextLong();

        contador = 1;
        while (numero / 10 != 0) {
            numero = numero / 10;
            contador++;
        }
        System.out.println("El número tiene " + contador + " dígitos");

        System.out.println("Dime un número entero: ");
        numero = sc.nextLong();
        for(contador = 1; numero / 10 != 0; contador++) {
            numero = numero / 10;
        }
        System.out.println("El número tiene " + contador + " dígitos");




    }
}
