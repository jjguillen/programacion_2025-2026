package tema3.cadenas.ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {

        /**
         * Crea un programa en Java que solicite al usuario la introducción
         * de una cadena de caracteres y devuelva esta cadena invertida.
         * Haz dos versiones, una con String y otra con StringBuffer.
         */

        String cadena = "Javi tengo la cabeza loca ya, para!!!";
        System.out.println(cadena);

        StringBuffer sb = new StringBuffer(cadena);
        sb.reverse();
        System.out.println(sb);


    }
}
