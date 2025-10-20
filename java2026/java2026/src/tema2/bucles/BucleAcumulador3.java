package tema2.bucles;

import java.util.Scanner;

public class BucleAcumulador3 {
    public static void main(String[] args) {

        //Pide 5 precios de un producto y la cantidad de cada uno de ellos
        //Precio - cantidad
        //Precio - cantidad
        //Precio - cantidad
        //Precio - cantidad
        //Precio - cantidad

        //Mostrar el total de la compra

        Scanner sc = new Scanner(System.in);
        double precio;
        int cantidad;
        double total=0;

        for(int i=0; i < 5; i++) {
            System.out.println("Dime el precio: ");
            precio = sc.nextDouble();
            System.out.println("Dime la cantidad: ");
            cantidad = sc.nextInt();

            System.out.println("El precio es: " + (precio * cantidad));

            total += (precio * cantidad);
        }

        System.out.println("El total es: " + (total * 1.21));


    }
}
