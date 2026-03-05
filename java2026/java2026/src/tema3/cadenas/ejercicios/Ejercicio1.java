package tema3.cadenas.ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Cuenta las vocales del texto "Me gusta programar en Java los sábados por la mañana"

        String texto = "Me gusta programar en Java los sábados por la mañana";
        int contador = 0;

        for(int i=0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i'
                || texto.charAt(i) == 'o' || texto.charAt(i) == 'u' || texto.charAt(i) == 'á'
                || texto.charAt(i) == 'é' || texto.charAt(i) == 'í' || texto.charAt(i) == 'ó'
                || texto.charAt(i) == 'ú') {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " vocales en el texto");

    }
}
