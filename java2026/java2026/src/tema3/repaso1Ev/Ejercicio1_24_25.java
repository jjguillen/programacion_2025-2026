package tema3.repaso1Ev;

import java.util.Arrays;
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


    public static int sumarFila(int[][] matriz, int fila) {
        //0 1 2 3 4
        //1 2 3 4 5
        int suma = 0;
        //Recorrer la fila y sumar cada elemento
        for(int j=0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static boolean comprobarDiagonales(int[][] matriz) {
        boolean iguales = true;
        //4 5 6 7 8  0,0   0,4
        //6 3 1 2 3  1,1   1,3
        //8 5 2 3 1  2,2   2,2
        //9 6 3 5 4  3,3   3,1
        //7 4 1 2 5  4,4   4,0

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                //Diagonal principal
                if (i==j) {
                    //Si no coinciden, no seguir comprobando, no son iguales
                    if (matriz[i][j] != matriz[i][matriz.length-1-j]) {
                        iguales = false;
                        break;
                    }
                }
            }
        }
        return iguales;
    }

    public static int[] calcularMenor(int[][] matriz) {
        int[] datos = new int[3]; //0 - valor, 1 - i, 2 - j
        datos[0] = matriz[0][0];
        //datos[1] = 0;
        //datos[2] = 0;
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if (matriz[i][j] < datos[0]) {
                    datos[0] = matriz[i][j];
                    datos[1] = i;
                    datos[2] = j;
                }
            }
        }

        return datos;
    }

    public static void ordenarColumnas(int[][] matriz) {
        //1. Trasponer la matriz, pasar filas a columnas
        int aux;
        for(int i=0; i < matriz.length; i++) {
            for(int j=i+1; j < matriz[i].length; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        //2. Ordenar filas de menor a mayor
        for(int i=0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }

        //3. Trasponer la matriz de nuevo
        for(int i=0; i < matriz.length; i++) {
            for(int j=i+1; j < matriz[i].length; j++) { //OJO j=i+1 !!!
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
    }

    public static void main(String[] args) {

        //No olvidar hacer 20x20
        int[][] matriz = new int[20][20];
        int opcion = 0;
        int colum1, colum2;
        int fila, resultado;
        int[] menor; // 0 -> el valor menor, 1 -> la fila del menor, 2 -> la columna del menor
        boolean diagonalesIguales;
        Scanner sc = new Scanner(System.in);

        rellenarMatriz(matriz);

        do {
            pintarMatriz(matriz);
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
                    try {
                        System.out.println("Dime la fila a sumar:");
                        fila = Integer.parseInt(sc.nextLine());
                        resultado = sumarFila(matriz, fila);
                        System.out.println("La suma de la fila " + fila + " es " + resultado);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Formato de datos invalido");
                    }
                    break;
                case 3:
                    diagonalesIguales = comprobarDiagonales(matriz);
                    System.out.println("Las matrices son iguales: " + diagonalesIguales);
                    break;
                case 4:
                    menor = calcularMenor(matriz);
                    System.out.println("El menor valor es: " + menor[0] + " en la fila "
                            + menor[1] + " y columna " + menor[2]);
                    break;
                case 5:
                    /*
                    //Ordenar filas
                    for(int i=0; i < matriz.length-1; i++) {
                        Arrays.sort(matriz[i]);
                    }
                     */
                    ordenarColumnas(matriz);
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
