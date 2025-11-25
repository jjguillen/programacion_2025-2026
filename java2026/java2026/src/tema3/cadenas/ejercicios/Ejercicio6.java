package tema3.cadenas.ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {

        /**
         * Diseña un programa en Java que solicite al usuario una cadena de
         * caracteres y muestre por pantalla un conteo de cuántas vocales,
         * consonantes y espacios en blanco contiene la cadena introducida.
         */

        String texto = "Javi tengo la cabeza loca ya, para por Dios";
        int contadorVocales = 0, contadorConsonantes = 0, contadorEspacios = 0;

        for(int i=0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i'
                    || texto.charAt(i) == 'o' || texto.charAt(i) == 'u' || texto.charAt(i) == 'á'
                    || texto.charAt(i) == 'é' || texto.charAt(i) == 'í' || texto.charAt(i) == 'ó'
                    || texto.charAt(i) == 'ú') {
                contadorVocales++;
            } else if (texto.charAt(i) == ' ') {
                contadorEspacios++;
            } else if (texto.charAt(i) == ',' || texto.charAt(i) == '.') {
                continue;
            } else {
                contadorConsonantes++;
            }
        }

        System.out.println("Contador vocales: " + contadorVocales);
        System.out.println("Contador consonantes: " + contadorConsonantes);
        System.out.println("Contador espacios: " + contadorEspacios);
    }
}
