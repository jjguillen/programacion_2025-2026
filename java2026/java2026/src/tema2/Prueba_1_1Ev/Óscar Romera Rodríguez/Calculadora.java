package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void mostrarMenu() {
        System.out.println("1. Mostrar la tabla de multiplicar del número: ");
        System.out.println("2. Calcular el factorial del número");
        System.out.println("3. Mostrar todos los divisores del número");
        System.out.println("4. Salir");
    }
    public static int tablaMultiplicar(int a) {
        for(int i=1; i <= 10; i++) {
            System.out.println(a + "x" + i + " = " + (a * i));
        }
        return a;
    }
    public static int calcularFactorial(int a) {
        int acumulador = 1;
        for(int i=2; i <= a; i++) {
            acumulador = acumulador * a;
        }
        return acumulador;
    }
    public static int calcularDivisores(int a) {
        int i;
        for (i = 2; i <= a - 1; i++) {
            if (a % i == 0) {
                System.out.println("Divisor: " + i);
            }
        }
        return i;
    }

    static void main(String[] args) {

        int num;
        int opcion;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");

        try {
            num = sc.nextInt();
            do {
                mostrarMenu();
                System.out.println("Elija una opcion: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Tabla de multiplicar del número " + tablaMultiplicar(num));
                        break;
                    case 2:
                        System.out.println("Factorial del número es: " + calcularFactorial(num));
                        break;
                    case 3:
                        System.out.println("Los divisores del número " + calcularDivisores(num));
                        break;
                    case 4:
                        System.out.println("Gracias por usar el programa");
                        break;
                }
            } while (opcion != 4);
        }catch (Exception exc) {
            System.out.println("Valor incorrecto " + exc);
        }
    }
}
