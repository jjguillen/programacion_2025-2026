package tema3.ejerciciosmatrices;

public class Ejemplo5 {
    public static void pintarMatriz(int[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {

        //Dada una matriz 5x5 de enteros generados aleatoriamente,
        //muestra los elementos de la diagonal principal y calcula su suma.

        int[][] matriz = new int[5][5];
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        pintarMatriz(matriz);

        int acum = 0;
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if (i==j) {
                    System.out.print(matriz[i][j] + " ");
                    acum += matriz[i][j];
                }
            }
        }

        System.out.println("La suma de la diagonal principal es: " + acum);




    }
}
