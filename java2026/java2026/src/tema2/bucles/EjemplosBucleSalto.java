package tema2.bucles;

import java.util.Objects;
import java.util.Scanner;

public class EjemplosBucleSalto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Muestra los números impares entre 1 y 20, menos el 9 y el 13
        for(int contador=1; contador <= 20; contador += 2) {
            if(contador == 9 || contador == 13) {
                continue; //Salta el bucle a la siguiente iteración
            }
            System.out.print(contador + " ");
        }

        //Pide palabras por teclado hasta que se introduzca la palabra "fin"
        //cadena.equals(<lo que quieres comparar>) --> compara dos cadenas
        String palabra = "";
        while (true) {
            System.out.println("Introduce palabra: ");
            palabra = sc.nextLine();
            if (palabra.equals("fin")) {
                break; //Termina el bucle totalmente
            }
            System.out.println("La palabra introducida es: " + palabra);
        }

        System.out.println("Fin del programa");

    }
}
