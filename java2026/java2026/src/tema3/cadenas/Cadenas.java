package tema3.cadenas;

public class Cadenas {
    public static void main(String[] args) {

        char[] texto2 = {'H','o','l','a',' ','m','u','n','d','o'};
        System.out.println(texto2[2]);

        //              0123456789
        String texto = "Hola mundo";
        System.out.println(texto.charAt(2));

        //Pintar String con un for
        System.out.println("String con for");
        for(int i=0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
        }

        //Creación de un String
        String cadena = new String("Hola mundo");
        String cadena2 = "Hola mundo"; //Equivalente a lo de arriba




    }

}
