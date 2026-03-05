package tema2.procedimientosYFunciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Procedimientos2 {
    /**
     * Procedimiento que pinta las opciones disponibles en el programa
     * @param numeroOpciones: número de opciones a pintar
     */
    public static void pintarOpciones(int numeroOpciones) {
        int i;
        for(i=1; i<=numeroOpciones-1; i++) {
            System.out.println(i + ". Opción " + i);
        }
        System.out.println(i + ". Salir");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion=-1;

        do {
            pintarOpciones(3);

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
