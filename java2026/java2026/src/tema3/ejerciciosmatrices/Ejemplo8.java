package tema3.ejerciciosmatrices;

public class Ejemplo8 {

    public static void pintarMatriz(char[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%2c", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {

        /**
         * Dada una matriz 8x8 que representa una tablero de ajedrez
         * Dadas las coordenadas i,j donde está el rey en el tablero
         * Dime a qué posiciones del tablero se puede mover el rey
         */

        char[][] tablero = new char[8][8];

        for(int i=0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }

        int reyX = 0, reyY = 1;
        tablero[reyX][reyY] = 'R';

        pintarMatriz(tablero);

        //(reyX-1 reyY+1)         x
        //(reyX-1 reyY)           xR
        //(reyX-1 reyY-1)         x
        //(reyX+1 reyY)
        //(reyX+1 reyY-1)
        //(reyX+1 reyY+1)
        //(reyX reyY-1)
        //(reyX reyY+1)

        tablero[reyX-1][reyY] = '*';
        tablero[reyX-1][reyY+1] = '*';
        tablero[reyX-1][reyY-1] = '*';
        tablero[reyX+1][reyY] = '*';
        tablero[reyX+1][reyY+1] = '*';
        tablero[reyX+1][reyY-1] = '*';
        tablero[reyX][reyY+1] = '*';
        tablero[reyX][reyY-1] = '*';

        pintarMatriz(tablero);

    }
}
