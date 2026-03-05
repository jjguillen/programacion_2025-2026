package tema3.cadenas.ejercicios;

public class Ejercicio3 {

    public static String mitadCadena(String cad) {
        return cad.substring(0, cad.length()/2);
    }

    public static String mitadFinalCadena(String cad) {
        return cad.substring(cad.length()/2);
    }

    public static void main(String[] args) {

        /**
         * Escribe un metodo que te devuelva la mitad de una cadena
         * (si tiene longitud impar, decide qué hacer con el carácter central)
         */

        String cadena = "Esto es una cadena muy larga, te quedas con la mitad";
        System.out.println(mitadCadena(cadena));
        System.out.println(mitadFinalCadena(cadena));


    }
}
