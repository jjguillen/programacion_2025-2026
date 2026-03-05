package tema1.ejerciciosRepaso;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        String nombre;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Hola " + nombre);

    }
}
