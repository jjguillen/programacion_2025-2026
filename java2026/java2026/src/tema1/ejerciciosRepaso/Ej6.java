package tema1.ejerciciosRepaso;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        long totalMinutos;
        long horas, restoMinutos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el total de minutos:");
        totalMinutos = sc.nextLong();

        horas =  totalMinutos / 60;
        restoMinutos = totalMinutos % 60;

        System.out.println("Num. horas: " + horas + " y num minutos: " + restoMinutos);



    }
}
