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

    public static int buscarLetra(char[] letras, char letra) {
        for(int i = 0; i < letras.length; i++) {
            if (letras[i] == letra) {
                return i;
            }
        }
        return -1;
    }

    public static String crypt(String texto, boolean enc_dec) {
        char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        char[] letrasEnc = {'A','c','d','f','E','g','h','j','I','k','l','m','n',
                'p','O','q','r','s','t','v','U','w','y','x','z','b',' '};

        //Recorrer el texto caracter a caracter
        //Si encripto busco en el arrays letras la posición y devuelvo en letrasEnc
        //Si deencripto busco en el arrays letrasEnc la posición y devuelvo en letras
        int posicion;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < texto.length(); i++) {
            if (enc_dec) {
                posicion = buscarLetra(letras, texto.charAt(i));
                sb.append(letrasEnc[posicion]);
            } else {
                posicion = buscarLetra(letrasEnc, texto.charAt(i));
                sb.append(letras[posicion]);
            }
        }

        return sb.toString();
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

        //char[] letras = {'a','b','c','d'};
        //char[] letrasEnc = {'A','c','d','f'};

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

        System.out.println("---------------- Otra forma de hacerla con dos arrays");
        //1.Cambiar letras
        String textoV = crypt(texto, true);
        //2.Invertir palabras
        String[] palabras = textoV.split(" ");
        String invertirPalabras = invertirPalabras(palabras);
        System.out.println(invertirPalabras);

        //1.Invertir palabras
        String[] palabras2 = invertirPalabras.split(" ");
        invertirPalabras = invertirPalabras(palabras2);
        //2.Cambiar letras
        textoV = crypt(invertirPalabras, false);
        System.out.println(textoV);

    }

}
