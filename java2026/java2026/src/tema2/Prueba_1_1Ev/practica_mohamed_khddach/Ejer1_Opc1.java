package tema2.Prueba_1_1Ev.practica_mohamed_khddach;

import java.util.Scanner;

public class Ejer1_Opc1 {

    /**
     * Realiza un programa que pida un número entero positivo por teclado. Luego muestra un menú
     * con las siguientes opciones:
     * 1. Mostrar la tabla de multiplicar de ese número (del 1 al 10)
     * 2. Calcular el factorial del número
     * 3. Mostrar todos los divisores del número
     * 4. Salir
     * Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
     * devuelva el resultado o lo muestre directamente.
     */

    /**
     * Procedimiento que le pasas un número y muestra su tabla de multiplicar de 1 a 10
     * @param numero
     */
    public static void tablaMultiplicar(int numero) {
        for (int i=1; i<=10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    /**
     * Función que devuelve el factorial de un número
     * @param numero
     * @return
     */
    public static double factorial(int numero) {
        double acumulador = 1;
        for(int i=2; i<=numero; i++) {
            acumulador *= i;
        }

        return acumulador;
    }

    /**
     * Procedimiento que devuelve los divisores de un número
     * En caso de no tener pinta un mensaje indicando que no tiene divisores
     * @param numero
     */
    public static void divisores(int numero) {
        boolean tieneDivisores = false;
        for(int i=2; i<=numero-1; i++) {
            if (numero % i == 0) {
                System.out.print(i + ", ");
                tieneDivisores = true;
            }
        }

        if (!tieneDivisores) {
            System.out.println("El número " + numero + " no tiene divisores, es primo");
        }
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        int numero=0;

        do {
            //COMPROBACIÓN QUE EL NÚMERO ES UN ENTERO POSITIVO
            System.out.println("Dime un número entero positivo:");
            try {
                numero = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Número mal escrito");
                continue;
            }

            //Comprobar que es un número positivo
            if (numero <= 0) {
                System.out.println("Escribe un número positivo");
                continue;
            }

            //PINTAR OPCIONES
            System.out.println("CALCULADORA - Elige opción para continuar");
            System.out.println("1. Mostrar la tabla de multiplicar de ese número (del 1 al 10)");
            System.out.println("2. Calcular el factorial del número");
            System.out.println("3. Mostrar todos los divisores del número");
            System.out.println("4. Salir");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Número mal escrito");
            }

            //EJECUTAR OPCION ELEGIDA
            switch (opcion) {
                case 1:
                    System.out.println("1");
                    tablaMultiplicar(numero);
                    break;
                case 2:
                    System.out.println("2");
                    System.out.println("El factorial de " + numero + " es " + factorial(numero));
                    break;
                case 3:
                    System.out.println("3");
                    divisores(numero);
                    break;
                case 4:
                    System.out.println("4");
                    break;
                default:
                    System.out.println("Opción incorrecta (1-4)");
            }

        } while (opcion != 4);
        
        
    }
}
