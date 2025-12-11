package tema3.examen1EV;

public class Ejercicio1 {

    /**
     * Dado un array de palabras devuelve un String con cada palabra invertida y separada por un espacio
     * @param palabras
     * @return
     */
    public static String invertirPalabras(String[] palabras) {
        StringBuilder buffer = new StringBuilder();
        for(int i = 0; i < palabras.length; i++) {
            buffer.append( (new StringBuffer(palabras[i])).reverse() )
                    .append(" ");
        }
        return buffer.toString().trim();
    }

    /**
     * Dada una cadena la encripta:
     * - Cambia todas las consonantes por su siguiente letra en el abecedario (z pasa a b).
     * - Las vocales a, e, i, o, u pasan a mayúsculas.
     * - Invierte el orden de las letras en cada palabra individual
     * @param texto
     * @return
     */
    public static String encriptar(String texto) {
        StringBuilder sb = new StringBuilder(texto);
        StringBuilder salida = new StringBuilder();
        char letra;
        for(int i = 0; i < texto.length(); i++) {
            letra = texto.charAt(i);
            //Vocales y consonantes
            //No consideramos encriptar acentos
            switch (letra) {
                case 'a': sb.setCharAt(i,'A'); break;
                case 'e': sb.setCharAt(i,'E'); break;
                case 'i': sb.setCharAt(i,'I'); break;
                case 'o': sb.setCharAt(i,'O'); break;
                case 'u': sb.setCharAt(i,'U'); break;
                case 'z': sb.setCharAt(i,'b'); break;
                case 'd': sb.setCharAt(i,'f'); break;
                case 'h': sb.setCharAt(i,'j'); break;
                case 'ñ':  sb.setCharAt(i,'p'); break;
                case 't': sb.setCharAt(i,'v'); break;
                case ' ':  sb.setCharAt(i,' '); break;
                default: sb.setCharAt(i, (char) (letra + 1)); break;
            }
        }
        //Invertir palabras
        String[] palabras = sb.toString().split(" ");

        return invertirPalabras(palabras);
    }

    public static String desencriptar(String texto) {
        StringBuilder invertirsb = new StringBuilder(texto);
        StringBuilder sb;
        char letra;

        //Invertir palabras
        String[] palabras = invertirsb.toString().split(" ");
        String invertirPalabras = invertirPalabras(palabras);

        //Vocales y consonantes
        sb = new StringBuilder(invertirPalabras);
        for(int i = 0; i < invertirPalabras.length(); i++) {
            letra = invertirPalabras.charAt(i);
            //Vocales y consonantes
            switch (letra) {
                case 'A': sb.setCharAt(i,'a'); break;
                case 'E': sb.setCharAt(i,'e'); break;
                case 'I': sb.setCharAt(i,'i'); break;
                case 'O': sb.setCharAt(i,'o'); break;
                case 'U': sb.setCharAt(i,'u'); break;
                case 'b': sb.setCharAt(i,'z'); break;
                case 'f': sb.setCharAt(i,'d'); break;
                case 'j': sb.setCharAt(i,'h'); break;
                case 'p':  sb.setCharAt(i,'ñ'); break;
                case 'v': sb.setCharAt(i,'t'); break;
                case ' ':  sb.setCharAt(i,' '); break;
                default: sb.setCharAt(i, (char) (letra - 1)); break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String texto = "Esto es un frase";
        texto = texto.toLowerCase();

        System.out.println(texto);
        System.out.println(encriptar(texto));
        System.out.println(desencriptar(encriptar(texto)));
    }

}
