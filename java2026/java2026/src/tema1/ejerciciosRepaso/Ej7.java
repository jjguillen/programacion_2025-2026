package tema1.ejerciciosRepaso;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {

        double total;
        double precioFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el total de la compra ");
        total= sc.nextDouble();
        precioFinal= total - (total * 0.15);
        System.out.println("El precio final es: " + precioFinal);

   }
}
