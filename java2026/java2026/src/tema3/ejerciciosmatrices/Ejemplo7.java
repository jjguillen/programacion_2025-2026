package tema3.ejerciciosmatrices;

public class Ejemplo7 {

    public static void pintarMatriz(char[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%2c ", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {

        //Crea una matriz 10x10 y rellénala con símbolos '-'.
        //Luego, dibuja una 'X' en la matriz utilizando el símbolo 'X' desde las esquinas hasta el centro.

    }
}
