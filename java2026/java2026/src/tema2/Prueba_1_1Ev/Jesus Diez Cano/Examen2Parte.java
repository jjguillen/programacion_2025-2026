import java.util.Random;
import java.util.Scanner;

public class Examen2Parte {
    public static void main(String[] args) {

        //El Juego del Nim
        //Dos jugadores (el usuario y el ordenador) comienzan con 21 cerillas. Por turnos, cada jugador
        //retira entre 1 y 3 cerillas. El jugador que retire la última cerilla pierde la partida.
        //Escribe un programa que:
        //Permita al usuario elegir cuántas cerillas quiere retirar (validando que sea entre 1 y 3)
        //El ordenador retire aleatoriamente entre 1 y 3 cerillas
        //Muestre el estado del juego después de cada turno
        //Indique quién ha ganado al finalizar

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int cerillas = 21;
        int usuario;
        System.out.println("Bienvenidos al JUEGO DEL NIM");
        System.out.println("El juego empieza con 21 cerillas el ultimo en retirar 1 pierde");

        while (cerillas > 0) {
            do {
                System.out.println("Cuantas cerillas quieres quitar (1-3)");
                usuario = sc.nextInt();
                if (usuario < 1 || usuario > 3) {
                    System.out.println("Debes quitar entre 1 y 3");
                }
            }while (usuario < 1 || usuario > 3);

            cerillas -= usuario;
            System.out.println("Ha retirado " + usuario + " cerillas las restantes son " + cerillas );
            if (cerillas <= 0) {
                System.out.println("El jugador perdio GAME OVER");
                break;
            }
            int ordenador = random.nextInt(3) + 1;

            System.out.println("El ordenador retira " + ordenador + " cerillas ");
            cerillas -= ordenador;
            System.out.println("Cerillas restantes son: " + cerillas);
            if (cerillas <= 0) {
                System.out.println("El ordenador perdio GAME OVER");
                break;
            }
        }
    }
}
