package tema2.procedimientosYFunciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Procedimientos1 {

    //NO se ejecuta hasta que no se le llama
    //Es posible reutilizarlo
    //Si no devuelve nada ponemos -> void
    //El código que se repita es interesante llevarlo a una función o procedimiento
    public static void pintarOpciones() {
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Salir");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion=-1;

        do {
            pintarOpciones();

            //Si no introduces un entero, pongo la opción a -1
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException exc) {
                sc = new Scanner(System.in); //Para volver a pedir datos
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    System.out.println("1"); break;
                case 2:
                    System.out.println("2"); break;
                case 3:
                    System.out.println("Gracias por usar nuestro programa"); break;
                default:
                    System.out.println("Opción incorrecta (1-3)");
            }
        } while (opcion != 3);


    }



}
