package tema2.bucles;

import java.util.Scanner;

public class BucleAcumulador {
    public static void main(String[] args) {

        //Pide 5 números por teclado y guarda en una variable la suma de los
        //que sean impares
        Scanner sc = new Scanner(System.in);

        long numero;
        long suma=0;

        for(int i=0; i < 5; i++) {
            System.out.println("Dime un número: ");
            numero = sc.nextLong();
            if (numero % 2 == 1) { //Impar
                suma += numero; //suma = suma + numero
            }
        }

        System.out.println("La suma es " + suma);

    }
}
