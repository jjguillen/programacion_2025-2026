package tema1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Un alumno del módulo de Programación quiere saber su nota final. Esta consta de:
        //55% de tres notas parciales (media aritmética de las tres)
        //30% calificación examen final
        //15% calificación trabajo final
        //Pide los valores de entrada y muestra la nota final

        //ANÁLISIS
        //V.E.: double notaE1, notaE2, notaE3, notaEF, notaTF
        //V.S.: double notaFinal

        //DISEÑO
        //notaFinal = ( ((notaE1 + notaE2 + nota3) / 3) * 0.55 ) + (0.3 * notaEF) + (0.15 * notaTF)

        double notaE1, notaE2, notaE3, notaEFinal, notaTFinal;
        double notaFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime primera nota: ");
        notaE1 = sc.nextDouble();
        System.out.println("Dime segunda nota: ");
        notaE2 = sc.nextDouble();
        System.out.println("Dime tercera nota: ");
        notaE3 = sc.nextDouble();
        System.out.println("Dime nota examen final: ");
        notaEFinal = sc.nextDouble();
        System.out.println("Dime nota trabajo final: ");
        notaTFinal = sc.nextDouble();

        notaFinal = ( ((notaE1 + notaE2 + notaE3) / 3) * 0.55 )
                + (0.3 * notaEFinal)
                + (0.15 * notaTFinal);

        System.out.printf("Nota final: %.2f%n", notaFinal);
    }
}
