package tema2.bucles;

import java.util.Scanner;

public class Repaso9 {
    public static void main(String[] args) {

        //Realizar un ejemplo de menú, donde podemos escoger las distintas opciones
        // (Opción A, Opción B, Salir) hasta que seleccionamos la opción de “Salir”.

        Scanner sc = new Scanner(System.in);
        int opcion=-1;

        while (opcion != 4) {
            System.out.println("1. Opción A");
            System.out.println("2. Opción B");
            System.out.println("3. Opción C");
            System.out.println("4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("OPCIÓN A");
                    break;
                case 2:
                    System.out.println("OPCIÓN B");
                    break;
                case 3:
                    System.out.println("OPCIÓN C");
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro programa");
                    break;
                default:
                    System.out.println("Opción elegida incorrecta (1-4)");
            }


        }







    }
}
