import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public static void main() {

        //Calculadora de Propiedades Numéricas
        //Realiza un programa que pida un número entero positivo por teclado. Luego muestra un menú
        //con las siguientes opciones:
        //1. Mostrar la tabla de multiplicar de ese número (del 1 al 10)
        //2. Calcular el factorial del número
        //3. Mostrar todos los divisores del número
        //4. Salir
        //Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
        //devuelva el resultado o lo muestre directamente

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int contador;
        int opcion = 0;
        int numero2;
        long acumulador = 0;
        int numero3;

        do {
            try {
                System.out.println("OPERACIÓN A REALIZAR (1-5)");
                System.out.println("1. Mostrar la tabla de multiplicar (1-10)");
                System.out.println("2. Calcular el factorial del numero");
                System.out.println("3. Mostrar todos los divisores del numero");
                System.out.println("4. Salir");

                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el numero de la tabla: ");
                        numero = sc.nextInt();

                        for (int j = 1; j <= 10; j++) {
                            System.out.println(numero * j);
                        }
                        System.out.println("El numero usado en la tabla es: " + numero);
                        break;

                    case 2:
                        System.out.println("Ingrese el numero: ");
                        numero2 = sc.nextInt();
                        for (int i = 1; i <= numero; i++) {
                            acumulador = acumulador * i;
                        }
                        System.out.println("El resultado es: " + numero2 + " = " + acumulador);
                        break;



                    case 3:
                        System.out.println("Ingrese el numero: ");
                        numero3 = sc.nextInt();
                        for (int d = 1; d <= numero3; d++) {
                            if (numero3 % d == 0) {
                                System.out.println(d);
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Gracias por usar nuestro programa hasta luego");
                    default:

                }


            } finally {

            }
        }while (opcion != 5);
    }
}