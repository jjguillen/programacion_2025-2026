package tema3.cadenas.ejercicios;

public class Ejercicio11 {

    /**
     * Crea un programa que reciba una cadena de caracteres y la devuelva
     * invertida con efecto espejo. Se concatena a la palabra original su
     * inversa, compartiendo la última letra, que hará de espejo.
     * Por ejemplo, al introducir "teclado" devolverá "tecladodalcet".
     * Haz dos versiones,
     * una con String y otra con StringBuffer.
     */

    public static void main(String[] args) {

        String cadena = "teclado";

        //Versión StringBuffer
        StringBuffer cadenaInvertida = new StringBuffer(cadena);
        StringBuffer resultado = new StringBuffer();
        //System.out.println(cadenaInvertida.reverse());

        resultado.append(cadenaInvertida)
                 .append(cadenaInvertida.reverse().substring(1));

        System.out.println(resultado);

        //Versión con String
        String resuStr = cadena;

        //0123456
        //teclado
        for(int i=cadena.length()-2; i >= 0; i--) {
            resuStr += cadena.charAt(i);
        }
        System.out.println(resuStr);


    }



}
