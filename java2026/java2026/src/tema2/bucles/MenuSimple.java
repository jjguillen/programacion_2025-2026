package tema2.bucles;

import java.util.Scanner;

public class MenuSimple {
    public static void main(String[] args) {

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Primera opción");
            System.out.println("2. Segunda opción");
            System.out.println("3. Tercera opción");
            System.out.println("4. Salir");

            System.out.println("Dime una opción");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1,2,3:
                    System.out.println("Has elegido la opción " + opcion);
                    break;
                case 4:
                    System.out.println("Adiós, hasta la próxima");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 4); //El bucle termina cuando la opción es igual a 4



    }
}
