package tema3.examen1EV;

import java.util.Scanner;

public class Ejercicio3_Buscaminas {
    public static int SIZE=7;

    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Genera coordenadas aleatorias para poner bomba
     * Repite si en la posición ya hay una bomba
     * @param tablero
     */
    private static void ponerBomba(char[][] tablero) {
        int fila, columna;

        do {
            fila = generarAleatorio(0,SIZE-1);
            columna = generarAleatorio(0,SIZE-1);
            if (tablero[fila][columna] != 'B') {
                tablero[fila][columna] = 'B';
                break;
            }
        }  while (true);

    }

    /**
     * Rellenamos el tablero con '-' y colocamos 5 minas
     * @param tablero
     */
    public static void inicializarTablero(char[][] tablero) {
        int numBombas = 5;
        int valor;

        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }

        //Colocar 5 bombas
        for(int i=0; i < 5; i++) {
            ponerBomba(tablero);
        }
    }

    /**
     * Pinta la matriz en pantalla
     * @param matriz
     */
    public static void mostrarTablero(char[][] matriz, boolean mostrarMinas) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if (mostrarMinas && matriz[i][j] == 'B') { //Ver al principio si me pone los barcos
                    System.out.printf("%2c", matriz[i][j]);
                } else if (!mostrarMinas && matriz[i][j] == 'B') {
                    System.out.printf("%2c", '-');
                } else {
                    System.out.printf("%2c", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    /**
     * Otra forma de contar las bombas adyacentes
     * Hago un for para los desplazamientos en fila
     * Dentro un for para los desplazamientos en columna
     * Calculo la nueva posición de fila y columna y antes de acceder al tablero
     * compruebo que esté en el rango. Como es un if, lo primero que compruebas se
     * hace antes y si es false no accedería a tablero[nfila][ncolumna]
     * @param tablero
     * @param fila
     * @param columna
     * @return
     */
    public static int contarMinasAdyacentes2(char[][] tablero, int fila, int columna) {
        int contador = 0;
        int filas = tablero.length;
        int columnas = tablero[0].length;

        for(int df=-1; df <= 1; df++) {
            for(int dc = -1; dc <= 1; dc++) {
                if (df == 0 && dc == 0) continue; //Casilla actual

                int nuevaFila = fila + df;
                int nuevaColumna = columna + dc;

                //Límites
                if (nuevaFila >= 0 && nuevaFila < filas &&
                        nuevaColumna >= 0 && nuevaColumna < columnas &&
                        tablero[nuevaFila][nuevaColumna] == 'B')
                    contador++;
            }
        }

        return contador;
    }

    /**
     * Compruebo todas las posiciones adyacentes
     * Si alguna se sale del tablero lo controlo con un try-catch que no hace nada
     * @param tablero
     * @param fila
     * @param columna
     * @return número de bombas adyacentes
     */
    public static int contarMinasAdyacentes(char[][] tablero, int fila, int columna) {
        int contador=0;

        //Posiciones a mirar
        //fila - columna+1
        //fila - columna-1
        //fila+1 - columna-1
        //fila+1 - columna
        //fila+1 - columna+1
        //fila-1 - columna-1
        //fila-1 - columna
        //fila-1 - columna+1

        try {
            if (tablero[fila][columna + 1] == 'B') {
                contador++;
            }
        } catch (ArrayIndexOutOfBoundsException _) {}

        try {
            if (tablero[fila][columna-1] == 'B') {
                contador++;
            }
        } catch (ArrayIndexOutOfBoundsException _) {}

        try {
            if (tablero[fila+1][columna+1] == 'B') {
                contador++;
            }
        } catch (ArrayIndexOutOfBoundsException _) {}

        try {
            if (tablero[fila+1][columna] == 'B') {
                contador++;
            }
        } catch (ArrayIndexOutOfBoundsException _) {}

        try {
            if (tablero[fila+1][columna-1] == 'B') {
                contador++;
            }
        } catch (ArrayIndexOutOfBoundsException _) {}

        try {
            if (tablero[fila-1][columna+1] == 'B') {
                contador++;
            }
        } catch (ArrayIndexOutOfBoundsException _) {}

        try {
            if (tablero[fila-1][columna] == 'B') {
                contador++;
            }
        } catch (ArrayIndexOutOfBoundsException _) {}

        try {
            if (tablero[fila-1][columna-1] == 'B') {
                contador++;
            }
        } catch (ArrayIndexOutOfBoundsException _) {}

        return contador;
    }

    public static boolean haGanado(char[][] tablero) {
        boolean ganado = false;
        int casillasDesveladas = 0;
        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                if (tablero[i][j] != 'B' && tablero[i][j] != '-') {
                    casillasDesveladas++;
                }
            }
        }

        System.out.println("Casillas desveladas: " + casillasDesveladas);

        //Si has desvelado 44 casillas has ganado
        if (casillasDesveladas == (SIZE*SIZE - 5))
            return true;

        return ganado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] juego = new char[SIZE][SIZE];
        int x,y;
        int numMinasAdy;

        inicializarTablero(juego);
        mostrarTablero(juego, false);

        while (true) {
            try {
                System.out.println("Dime fila de tu disparo (0-" + (SIZE - 1) + "): ");
                x = Integer.parseInt(sc.nextLine());
                System.out.println("Dime columna de tu disparo (0-" + (SIZE - 1) + "): ");
                y = Integer.parseInt(sc.nextLine());

                //Comprobar si es bomba
                if (juego[x][y] == 'B') {
                    System.out.println("PERDISTE!");
                    mostrarTablero(juego, true);
                    break;
                }

                //Calcular adyacentes
                numMinasAdy = contarMinasAdyacentes(juego, x, y);

                //Descubrir casilla
                juego[x][y] = Integer.toString(numMinasAdy).charAt(0);

                //Comprobar victoria
                if (haGanado(juego)) {
                    System.out.println("GANASTE!!!");
                    mostrarTablero(juego, true);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Coordenadas inválidas");
            }

            mostrarTablero(juego, false);
        }

    }

}
