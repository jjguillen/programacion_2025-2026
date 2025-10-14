package tema2.bucles;

import java.util.Scanner;

public class EjemplosBucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Suma los 10 primeros números (0,1,...,9) y muestra el resultado
        //Ejemplo: 0+1+2+3+4+5+6+7+8+9 = 45
        int contador=0;
        int suma=0;
        while (contador < 10) {
            suma = suma + contador;
            contador++;
        }
        System.out.println("La suma es " + suma);

        //2. Pide en un bucle 5 números por teclado y di si cada uno es par o impar
        int num=1;
        int parImpar;
        while (num <= 5) {
            System.out.println("Introduce número: ");
            parImpar = sc.nextInt();
            if (parImpar % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
            }

            num++;
        }

        //3. Pide por teclado cuatro notas (double) y muestra la media de ellas
        double nota;
        double notaMedia=0;
        contador=0;
        while (contador < 4) {
            System.out.println("Introduce nota: ");
            nota = sc.nextDouble();
            notaMedia = notaMedia + nota;

            contador++;
        }
        System.out.println("La nota media es " + notaMedia/contador);


    }
}
