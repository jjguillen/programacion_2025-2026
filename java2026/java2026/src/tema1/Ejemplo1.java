package tema1;

import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {

        //String -> tipo de dato cadena
        //miNombre -> nombre de la variable
        //"Javier" -> valor que le doy a la variable
        // = -> operador de asignación, el valor que hay en el lado derecho
        // lo graba en la variable del lado izquierdo

        String miNombre = "Javier";
        miNombre = "Pepe";

        int edad = 21;
        edad = edad + 5;
        System.out.println(edad);

        //Ahora debéis imprimir el nombre y la edad
        //"Javier tiene 26 años"
        //miNombre + " tiene " + edad + " años"

        System.out.println(miNombre + " tiene " + edad + " años");



    }

}
