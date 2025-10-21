package tema2.bucles;

import java.util.Scanner;

public class BucleIndicador2 {
    public static void main(String[] args) {

        //Pide 5 cadenas de texto por teclado y dime si alguna de ellas
        //tiene una longitud mayor de 5 caracteres
        //Pista: cadena.length() devuelve la longitud de la cadena

        Scanner sc = new Scanner(System.in);
        String palabra;
        boolean mayorDe5 = false; //Indicador
        for(int i=0; i < 5; i++) {
            System.out.println("Dime una palabra: ");
            palabra = sc.nextLine();

            if (palabra.length() > 5) {
                mayorDe5 = true;
            }
        }

        if (mayorDe5) {
            System.out.println("Alguna de las palabras es mayor de 5 caracteres");
        } else {
            System.out.println("Ninguna de las palabras es mayor de 5 caracteres");
        }




    }
}
