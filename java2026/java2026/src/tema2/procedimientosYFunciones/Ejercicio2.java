package tema2.procedimientosYFunciones;

public class Ejercicio2 {

    /**
     * Procedimiento que pinta tantos asteriscos como indica numAst
     * @param numAst
     */
    public static void pintarAsteriscos(int numAst) {
        for (int i = 0; i < numAst; i++) {
            System.out.print("*"); //Sin salto
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Crear un procedimiento que pinte en la misma línea
        //tantos asteriscos como indique un parámetro llamado num
        //Ejemplo: pintarAsteriscos(5) --> *****
        //Al final que pinte un salto de línea

        for(int i=1; i<=10; i++) {
            pintarAsteriscos(i);
        }

    }
}
