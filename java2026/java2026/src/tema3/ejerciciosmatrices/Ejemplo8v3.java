package tema3.ejerciciosmatrices;

public class Ejemplo8v3 {

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

        int reyX = 3, reyY = 0;
        tablero[reyX][reyY] = 'R';

        pintarMatriz(tablero);

        //Pieza está en 0,0
        int[][] movimientos = { {-1,-1}, {-1,0}, {-1,1}, {0,-1}, {0,1}, {1,-1}, {1,0}, {1,1} };

        for(int i=0; i < movimientos.length; i++) {
            int x = reyX + movimientos[i][0];
            int y = reyY + movimientos[i][1];

            if (x < 0 || x >= tablero.length || y < 0 || y >= tablero[x].length) {
                System.out.println("Ahí no");
            } else {
                tablero[x][y] = '*';
            }

        }

        System.out.println();

        pintarMatriz(tablero);

    }
}
