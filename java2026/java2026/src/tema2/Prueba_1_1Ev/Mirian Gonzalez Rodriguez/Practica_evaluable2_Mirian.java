package programacion;

import java.util.Scanner;

public class Practica_evaluable2_Mirian {
    //Dos jugadores (el usuario y el ordenador) comienzan con 21 cerillas. Por turnos, cada jugador
    //retira entre 1 y 3 cerillas. El jugador que retire la última cerilla pierde la partida.
    //Escribe un programa que:
    //–
    //–
    //–
    //–
    //Permita al usuario elegir cuántas cerillas quiere retirar (validando que sea entre 1 y 3)
    //El ordenador retire aleatoriamente entre 1 y 3 cerillas
    //Muestre el estado del juego después de cada turno
    //Indique quién ha ganado al finalizar


    static void main(String[] args) {
        int total1= 21;



        int cerillas;
        System.out.println("Hay 21 cerillas");

        int adioscerilla = (int) (Math.random() * 3) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas cerillas quiere retirar?");
        cerillas = sc.nextInt();
        if (cerillas > 3) {
            System.out.println("Solo puedes retirar 1-3 cerillas");
        }

        if (cerillas <= 0) {
            System.out.println("El número de turno debe ser mayor o igual a uno");
        }


        for (int i = 1; i <= cerillas; i--) {
            int cerilla1 = adioscerilla;
            int cerilla2 = sc.nextInt();
            System.out.println("Tu sacas " + cerilla2);
            System.out.println("la maquina saca " + cerilla1);





            if (total1 <=cerillas) {
                System.out.println("has ganado");
            } else {
                System.out.println("perdiste");


            }
        }
    }
}






