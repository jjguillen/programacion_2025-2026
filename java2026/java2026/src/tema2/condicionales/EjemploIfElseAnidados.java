package tema2.condicionales;

import java.util.Scanner;

public class EjemploIfElseAnidados {
    public static void main(String[] args) {

        //Valores de entrada
        int edad = 19;
        char sexo = 'm'; //'h', 'm'  if (sexo == 'h')
        boolean amigoJefe = true;

        Scanner sc = new Scanner(System.in);
        //Poner antes la lectura de cadenas
        System.out.println("Dime tu sexo: ");
        sexo = sc.nextLine().charAt(0); //Se queda con el primer caracter

        System.out.println("Dime tu edad: ");
        edad = sc.nextInt();

        System.out.println("Eres amigo del jefe?");
        amigoJefe = sc.nextBoolean();

        //Puedes entrar a la discoteca si tienes 18 o más años
        //Puedes entrar si tienes más de dieciséis y eres mujer (no deberías)
        //Puedes entrar si tienes más de dieciséis y hombre y amigo del jefe
        //No puedes entrar en otro caso
        if (edad >= 18) {
            System.out.println("Puedes entrar a la discoteca");
        } else if (edad >= 16 && sexo == 'm') {
            System.out.println("Puedes entrar");
        } else if (edad >= 16 && sexo == 'h' && amigoJefe) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }

        //ES LO MISMO QUE LO DE ABAJO
        if ( (edad >= 18) || (edad >= 16 && sexo == 'm')
                || (edad >= 16 && sexo == 'h' && amigoJefe) ) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }






    }
}
