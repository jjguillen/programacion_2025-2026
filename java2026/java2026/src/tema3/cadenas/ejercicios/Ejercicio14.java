package tema3.cadenas.ejercicios;

public class Ejercicio14 {

    /**
     * Cifrado César. Crea un algoritmo de encriptación que reciba una frase y
     * una clave numérica. Sumará en código ASCII esa clave a cada letra de la frase.
     * Implementa también una función para desencriptar.
     *
     * "Esto es un secreto, el examen va a ser complicado"
     * Clave 3
     * "Hv..."
     *
     * String -> charAt -> char
     * char <-> int  char + 3 --> sumar al código ASCII 3
     *
     */

    public static String encriptar(String frase, int clave) {
        StringBuffer sb = new StringBuffer();

        for(int i=0; i < frase.length(); i++) {
            sb.append((char) (frase.charAt(i) + clave));
        }
        return sb.toString(); //StringBuffer lo convierte a String
    }

    public static String desencriptar(String frase, int clave) {
        return encriptar(frase, -clave);
    }

    public static void main(String[] args) {

        String texto = "Esto es un secreto, el examen va a ser complicado";
        System.out.println(encriptar(texto, 3));
        System.out.println(desencriptar(encriptar(texto, 3), 3));
    }
}
