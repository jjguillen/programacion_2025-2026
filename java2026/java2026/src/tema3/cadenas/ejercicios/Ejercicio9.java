package tema3.cadenas.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        /**
         * Crea un programa en Java que solicite al usuario dos cadenas de caracteres
         * y que devuelva la primera cadena, pero transformando en mayúsculas la parte
         * que coincide con la segunda cadena introducida.
         * Por ejemplo, si se introducen las cadenas "Esta es mi amiga Ana" y
         * "amiga" devolverá "Esta es mi AMIGA Ana".
         *
         * replace o replaceAll
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Introduce una palabra a buscar: ");
        String palabra = sc.nextLine();

        //Con replace
        //System.out.println(cadena.replace(palabra, palabra.toUpperCase()));

        //Sin usar replace

        //1. Convertir palabra a mayúsculas
        //2. Localizar el índice donde está palabra
        //3. Añadir la palabra en mayúsculas a partir de ahí
        //4. Añadir el resto de la cadena original

        //0. Buscar si existe la palabra en la cadena
        if (!cadena.contains(palabra)) {
            System.out.println("La palabra no existe en la cadena");
        } else {
            //1.Convertir palabra a mayúsculas
            String palabraM = palabra.toUpperCase();

            //2.Localizar el índice donde está palabra
            int indice = cadena.indexOf(palabra); //Encontrar la primera ocurrencia

            //3.Modify Selected Code…
            String cadenaFinal = cadena.substring(0, indice);
            cadenaFinal += palabraM;

            //4.Añadir el resto de la cadena original
            cadenaFinal += cadena.substring(indice + palabra.length());
            System.out.println(cadenaFinal);

        }

    }
}
