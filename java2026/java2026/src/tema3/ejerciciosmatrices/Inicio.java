package tema3.ejerciciosmatrices;

public class Inicio {

    /**
     * Pinta una matriz en pantalla
     * En principio es matriz de enteros, pero se puede poner
     * cualquier tipo de dato.
     * @param m
     */
    public static void pintarMatriz(int[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(); //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {

        int[][] matriz = new int[3][5]; // 3 filas y 5 columnas
        //matriz.length -> 3
        //matriz[i].length -> 5

        for(int i=0; i < matriz.length; i++) { //filas
            for(int j=0; j < matriz[i].length; j++) { //columnas
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        pintarMatriz(matriz);





    }

}
