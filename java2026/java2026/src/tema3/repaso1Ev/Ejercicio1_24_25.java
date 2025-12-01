package tema3.repaso1Ev;

import java.util.Scanner;

public class Ejercicio1_24_25 {

    public static void rellenarMatriz(int[][] matriz) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*100);
            }
        }
    }

    public static void pintarMatriz(int[][] matriz) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void intercambiarColumnas(int[][] matriz, int colum1, int colum2) {
        //0 1 2 3 4
        //1 2 3 4 5
        //6 7 8 9 10
        //Intercambiar elemento a elemento de cada columna grabando en un array auxiliar
        int aux;
        for(int i=0; i < matriz.length; i++) {
            aux = matriz[i][colum1];
            matriz[i][colum1] = matriz[i][colum2];
            matriz[i][colum2] = aux;
        }
    }

    public static void intercambiarFilas(int[][] matriz, int fila1, int fila2) {
        //Se puede intercambiar el array completo de la fila
        int[] aux = matriz[fila1];  //Un array auxiliar que apunta a la dirección de memoria de la fila1
        matriz[fila1] = matriz[fila2];
        matriz[fila2] = aux;
    }

    public static void main(String[] args) {

        //No olvidar hacer 20x20
        int[][] matriz = new int[5][5];
        int opcion = 0;
        int colum1, colum2;
        int menor, menorI, menorJ;
        Scanner sc = new Scanner(System.in);

        rellenarMatriz(matriz);
        pintarMatriz(matriz);

        do {
            System.out.println("INTRODUCE OPCIÓN:");
            System.out.println("1. Intercambiar columna");
            System.out.println("2. Sumar fila");
            System.out.println("3. Comprobar diagonales");
            System.out.println("4. Menor elemento (i,j)");
            System.out.println("5. Filas ordenadas de mayor a menor");
            System.out.println("6. Salir");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Formato de datos invalido");
                continue;
            }

            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Columna 1:");
                        colum1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Columna 2:");
                        colum2 = Integer.parseInt(sc.nextLine());
                        intercambiarColumnas(matriz, colum1, colum2);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Formato de datos invalido");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Gracias por usar nuestro programa");
                    break;
                default:
                    System.out.println("Opción incorrecta (1-6)");
            }
        } while (opcion !=6);


    }

}
