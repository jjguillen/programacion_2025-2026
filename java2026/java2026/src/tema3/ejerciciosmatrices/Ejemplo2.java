package tema3.ejerciciosmatrices;

public class Ejemplo2 {

    /**
     * Máximo de una matriz de doubles
     * Tomamos el máximo como el primer elemento y vamos recorriendo la matriz.
     * Si algún elemento de la matriz es mayor actualizamos el valor
     * máximo a ese elemento.
     * @param m
     * @return
     */
    public static double maximo(double[][] m) {
        double maximo = m[0][0];
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                if (m[i][j] > maximo) {
                    maximo = m[i][j];
                }
            }
        }

        return maximo;
    }

    public static void pintarLinea(double[][] m) {
        for(int i=0; i < m[0].length; i++){
            System.out.print("+");
            for(int j=0; j < m.length+4; j++){
                System.out.print("-");
            }
        }
        System.out.println("+");
    }

    public static void pintarMatriz(double[][] m) {

        pintarLinea(m);
        for (int i = 0; i < m.length; i++) {
            System.out.print("|");

            for (int j = 0; j < m[i].length; j++) {
                System.out.printf(" %6.2f |", m[i][j]);  // 2 decimales, ancho fijo
            }

            System.out.println();
            pintarLinea(m);
        }
    }

    public static void main(String[] args) {

        //Rellenar matriz de doubles 10x10 con números aleatorios entre 0.0 y 1.0
        //Encontrar el valor máximo y mínimo de la matriz

        double[][] matriz = new double[4][4];

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = Math.random();
            }
        }

        pintarMatriz(matriz);

    }
}
