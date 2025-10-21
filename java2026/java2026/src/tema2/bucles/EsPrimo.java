package tema2.bucles;

import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {

        //Pide un número por teclado y comprueba si es o no primo
        //Un número es primo si SOLO es divisible por 1 y por el mismo
        //Ejemplo: 19

        //Modo de hacerlo:
        //Indicador esPrimo=true
        //Bucle desde el 2 hasta el número - 1
        //Si el número es divisible por alguno de esos, esPrimo=false

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Dime un número entero: ");
        numero = sc.nextInt();
        boolean esPrimo = true;
        for(int i=2; i < Math.sqrt(numero); i++) {
            //Encontrar un divisor
            if (numero % i == 0) {
                esPrimo = false;
                break; //Si encontramos ya no es primo y no tiene sentido seguir buscando
            }
        }

        if(esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }
}
