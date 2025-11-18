package tema3.ejerciciosarrays;

import java.util.Scanner;

public class DiasCadaMes {
    public static void main(String[] args) {

        //Genera un programa que pida por teclado un número de mes
        //e indique el número de días que tiene ese mes.
        //Generar un array que guarde los días que tiene cada mes.

        int[] meses = {31,28,31,30,31,30,31,31,30,31,30,31};
        int numMes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el mes para saber el número de días (1-12):");
        try {
            numMes = Integer.parseInt(sc.nextLine());
            if (numMes < 1 || numMes > 12) {
                System.out.println("El mes es no válido");
                return;
            }
            System.out.println(meses[numMes-1]);
        } catch (NumberFormatException e) {
            System.out.println("Número inválido");
        } catch (Exception e) {
            System.out.println("Error, número de mes incorrecto");
        }


    }
}
