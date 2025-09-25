package tema1;

import java.sql.SQLOutput;

public class EjemploOperadoresRelacionales {
    public static void main(String[] args) {
        //Los operadores relacionales sirven para comparar (numéricamente)
        //Los operadores relacionales devuelven True o False (boolean)

        int numero1 = 100;
        int numero2 = 66;
        int numero3 = 100;

        System.out.println("Resultado (100 > 66) = " + (numero1 > numero2)); //Mayor
        System.out.println("Resultado (100 == 66) = " + (numero1 == numero2)); //Igual
        System.out.println("Resultado (100 == 100) = " + (numero1 == numero3)); //Igual
        System.out.println("Resultado (100 != 66) = " + (numero1 != numero2)); //Distintos
        System.out.println("Resultado (100 >= 66) = " + (numero1 >= numero2)); //Mayor o Igual
        System.out.println("Resultado (100 >= 100) = " + (numero1 >= numero3)); //Mayor o Igual
        System.out.println("Resultado (100 <= 66) = " + (numero1 <= numero2)); //Menor o Igual
        System.out.println("Resultado (100 <= 100)= " + (numero1 <= numero3)); //Menor o Igual
    }
}
