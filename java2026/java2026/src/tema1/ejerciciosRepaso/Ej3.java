package tema1.ejerciciosRepaso;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        double tempF;
        double tempC;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime temperatura en Farenheit: ");
        tempF = sc.nextDouble();

        tempC = (tempF - 32) * 5 / 9;

        System.out.println("Temperatura en Celsius: " + tempC);
    }
}
