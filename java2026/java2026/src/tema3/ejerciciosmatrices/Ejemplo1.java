package tema3.ejerciciosmatrices;

public class Ejemplo1 {

    public static void pintarMatriz(double[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                 System.out.printf("%5.2f ", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {
        //Rellenar matriz 4x4 con números aleatorios entre 1 y 100

        double[][] matriz = new double[4][4];

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = Math.random() * 100;
            }
        }

        pintarMatriz(matriz);

    }
}
