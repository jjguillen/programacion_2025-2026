package tema3.cadenas.ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {


        /**
         * Elimina los espacios (intermedios también) de una cadena de texto.
         */

        String texto = "    Esto es   un texto     con espacios,   muchos    ";
        System.out.println(texto + ".");

        //Usar trim para eliminar los espacios del principio y del final
        texto = texto.trim();

        System.out.println(texto + ".");

        //Quitar espacios intermedios
        //Sustituir cualquier combinación de espacios por un solo espacio
        texto = texto.replaceAll(" +", " ");
        //texto = texto.replace("  ", " ");
        System.out.println(texto);


    }
}
