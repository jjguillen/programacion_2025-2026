package tema2.bucles;

import java.util.Scanner;

public class BucleIndicador1 {
    public static void main(String[] args) {

        //Pide 5 números por teclado y dime si "alguno" de ellos
        //es múltiplo de 5

        Scanner sc = new Scanner(System.in);

        int numero;
        boolean esMultiplo = false; //Variable indicadora
        for(int i=0; i < 5; i++) {
            System.out.println("Dime un número: ");
            numero = sc.nextInt();

            if (numero % 5 == 0) {
                esMultiplo = true;
            }
        }

        if (esMultiplo) { //Al menos ha entrado una vez en el if en todas las iteraciones del bucle
            System.out.println("Alguno de los números introducidos es múltiplo de 5");
        } else { //No ha entrado al if ni una sóla vez en todo el bucle
            System.out.println("No has introducido ningún número múltiplo de 5");
        }


    }
}
