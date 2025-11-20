package tema3.ejerciciosmatrices;

public class Ejemplo2 {


    public static void pintarMatriz(double[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%5.2f ", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {

        //Rellenar matriz de doubles 10x10 con números aleatorios entre 0.0 y 1.0
        //Encontrar el valor máximo y mínimo de la matriz

        double[][] matriz = new double[10][10];

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = Math.random();
            }
        }

        pintarMatriz(matriz);

    }
}
