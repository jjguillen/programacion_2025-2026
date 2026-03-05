package tema1.ejerciciosRepaso;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        double base, altura;
        double perimetro, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el valor de la base: ");
        base = sc.nextDouble();

        System.out.println("Dime el valor de la altura: ");
        altura = sc.nextDouble();

        perimetro = 2 * base + 2 * altura;
        area = base * altura;

        System.out.println("Perímetro = " + perimetro);
        System.out.println("Área = " + area);


    }
}
