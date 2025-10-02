package tema1;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {

        //Lee de teclado dos valores de tipo double num1, num2
        //Intercambia el valor de las variables y píntalo por pantalla

        //ANÁLISIS:
        //V.E.: double num1, num2, temp
        //V.S.: num1 y num2

        //DISEÑO:
        //Necesito una variable auxiliar para grabar el valor original de num2
        //temp = num2
        //num2 = num1
        //num1 = temp

        double num1, num2, temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el valor del primer número");
        num1 = sc.nextDouble();
        System.out.println("Dime el valor del segundo número");
        num2 = sc.nextDouble();

        //num2 = num1; //No hay memoria respecto a lo que valía num2 por teclado
        //num1 = num2;

        temp = num2; //Grabo num2 antes de machacarlo con el valor de num1
        num2 = num1;
        num1 = temp;

        System.out.println("Número 1 " + num1);
        System.out.println("Número 2 " + num2);







    }
}
