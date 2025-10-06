package tema1;

public class Ejercicio19 {
    public static void main(String[] args) {

        //Escriba el valor ASCII de la 'J' y de la 'j' sin consultar la tabla.
        char letra = 'j';
        int ascii = (int) letra;
        System.out.println(ascii);

        letra = 'J';
        ascii = letra;
        System.out.println(ascii);

        System.out.println((int) letra);

    }
}
