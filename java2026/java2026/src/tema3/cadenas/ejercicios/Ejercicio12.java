package tema3.cadenas.ejercicios;

public class Ejercicio12 {
    /**
     * Encontrar la palabra de mayor longitud de este texto:
     * "No se me ocurre ninguna frase larga".
     *
     * String[] trozos = texto.split(" ");
     * int mayorLongitud = trozos[0].length();
     * int posicion = 0;
     *
     *
     */

    public static void main(String[] args) {

        String texto = "No se me ocurre ninguna frase larga";
        String[] trozos = texto.split(" ");
        int mayorLongitud = trozos[0].length();
        int posicion = 0;

        for(int i=1; i < trozos.length; i++) {
            if (trozos[i].length() > mayorLongitud) {
                mayorLongitud = trozos[i].length();
                posicion = i;
            }
        }
        System.out.println("La palabra de mayor longitud es: " + trozos[posicion]);

    }
}
