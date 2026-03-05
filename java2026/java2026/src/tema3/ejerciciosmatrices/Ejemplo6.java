package tema3.ejerciciosmatrices;

public class Ejemplo6 {

    public static void pintarMatriz(char[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%2c ", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {

        //Dibuja una matriz 8x8 con un patrón de tablero de ajedrez usando 'X' blancas y 'O' negras
        /**
         *    X 0 X 0 X 0 X 0   --> 0      (0,1) (0,3) (0,5) (0,7)
         *    0 X 0 X 0 X 0 X   --> 1      (1,0) (1,2) (1,4) (1,6)
         *    X 0 X 0 X 0 X 0   --> 2      (2,1) (2,3) (2,5) (2,7)
         *    0 X 0 X 0 X 0 X   --> 3      (3,0) (3,2) (3,4) (3,6)
         *    X 0 X 0 X 0 X 0   --> 4
         *    0 X 0 X 0 X 0 X   --> 5
         *    X 0 X 0 X 0 X 0   --> 6
         *    0 X 0 X 0 X 0 X   --> 7
         */

        //Ver cómo pintar las filas pares y cómo pintar las filas impares
        char[][] tablero = new char[8][8];

        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {

                if ( (i+j) % 2 != 0) {
                    tablero[i][j] = 'O';
                } else {
                    tablero[i][j] = 'X';
                }

                /*
                tablero[i][j] = 'X';
                if ((i % 2 == 0) && (j % 2 != 0))  {
                    tablero[i][j] = 'O';
                }
                if ((i % 2 != 0) && (j % 2 == 0))  {
                    tablero[i][j] = 'O';
                }
                 */


            }
        }

        pintarMatriz(tablero);





    }
}
