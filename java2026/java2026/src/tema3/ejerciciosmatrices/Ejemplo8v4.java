package tema3.ejerciciosmatrices;

public class Ejemplo8v4 {

    public static void movimientosPieza(char[][] m, int[][] movimientos, int x, int y) {
        for(int[] movimiento: movimientos) {
            int nx = x + movimiento[0];
            int ny = y + movimiento[1];

            //Comprobar que no te sales
            if(nx >= 0 && nx < m.length && ny >= 0 &&
                    ny < m[nx].length && m[nx][ny] == '-') {
                m[nx][ny] = '*';
            }
        }
    }

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

        int reyX = 3, reyY = 2;
        tablero[reyX][reyY] = 'R';

        int[][] movimientos = { {-1,-1}, {-1,0}, {-1,1}, {0,-1}, {0,1}, {1,-1}, {1,0}, {1,1} };

        movimientosPieza(tablero, movimientos, reyX, reyY);

        pintarMatriz(tablero);

    }
}
