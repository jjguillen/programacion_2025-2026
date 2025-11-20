package tema3.ejerciciosmatrices;

public class Ejemplo7 {

    public static void pintarMatriz(char[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%2c", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {

        //Crea una matriz 10x10 y rellénala con símbolos '-'.
        //Luego, dibuja una 'X' en la matriz utilizando el símbolo 'X' desde las esquinas hasta el centro.

        /**
         *   En matriz 5x5
         *   X---X   --> 0,0            0,4
         *   -X-X-   -->     1,1    1,3
         *   --X--   -->        2,2
         *   -X-X-   -->     3,1    3,3
         *   X---X   --> 4,0            4,4
         *
         *   Diagonal principal --> i == j
         *   Diagonal secundaria --> i+j == n-1 equivale i == (n-1) - j
         */

        char[][] matriz = new char[9][9];
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if ( (i==j) || (i+j==matriz.length-1) ){
                    matriz[i][j] = 'X';
                } else {
                    matriz[i][j] = '-';
                }
            }
        }

        pintarMatriz(matriz);

    }
}
