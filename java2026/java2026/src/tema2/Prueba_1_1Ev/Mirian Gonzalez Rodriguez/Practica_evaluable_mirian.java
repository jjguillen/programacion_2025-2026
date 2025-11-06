package programacion;

import java.util.Scanner;

public class Practica_evaluable_mirian {
    //Realiza un programa que pida un número entero positivo por teclado. Luego muestra un menú
    //con las siguientes opciones:
    //1.
    //2.
    //3.
    //4.
    //Mostrar la tabla de multiplicar de ese número (del 1 al 10)
    //Calcular el factorial del número
    //Mostrar todos los divisores del número
    //Salir
    //Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
    //devuelva el resultado o lo muestre directamente.

    public static int tablasmultiplicar(int num) {
        Scanner sc = new Scanner(System.in);
        int tablas = 0;
        for(int i=1; i <= 10; i++) {
            System.out.println(num + "x" + i + " = " + (num * i));

            }
        return tablas;
    }

    public static int Factorial(int numero) {
        int acumulador = 1;
        for (int i = 2; i <= numero; i++) {
            acumulador = acumulador * numero;
        }
        System.out.println("El factorial de " + numero + " es: " + acumulador);
        return acumulador;
    }

    public static int divisores (int numero) {
        numero %=numero;
        if (numero != 0)
            System.out.println("no es un divisor");
       if (numero==0)
        System.out.println("es un divisor");


        return numero;
    }
    public static int menu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Mostrar la tabla de multiplicar de ese número (del 1 al 10)");
        System.out.println("2.Calcular el factorial del número");
        System.out.println("3.Mostrar todos los divisores del número");
        System.out.println("4.Salir");

        int opcion= sc.nextInt();

        return opcion;
    }

    static void main(String[] args) {
        int opcion=1;

        System.out.println("Introduce un numero positivo y entero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        do{
            opcion=menu();
            switch (opcion){
                case 1:
                    tablasmultiplicar(numero);
                    break;
                case 2:
                   Factorial(numero);
                   break;

                case 3:
                    divisores(numero);
                    break;
                case 4:
                    System.out.println("El programa ha finalizado,gracias por su atención");
                    break;

                }
            }while(opcion!=4);
        }

    }

