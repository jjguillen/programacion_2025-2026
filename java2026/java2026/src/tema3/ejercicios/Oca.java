package tema3.ejercicios;

import java.util.Scanner;

public class Oca {

    public static int tirada() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Juego de la Oca con 63 casillas
        String[] casillas = new String[63]; //pos 0 - pos 62, casillas 1 - 63
        int[] ocas = {1, 5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59, 63};
        int[] puentes = {6,12};
        int[] dados = {26, 53};
        int muerte = 58;

        //int pozo = 31; --> hasta que pase otro
        //int carcel = 52; --> caiga otro
        //int laberinto = 42; --> cuatro turnos

        //Fichas jugadores, la posición en la que está cada jugador
        int[] jugadores = {-1,-1,-1,-1};

        int tirada=0;
        while(true) {

            //PARA CADA JUGADOR
            for(int i=0; i<jugadores.length; i++) {
                //Comprobar muerte
                if (jugadores[i] != -10) {
                    tirada = tirada();
                    System.out.println("Tirada: " + tirada);

                    //Mover jugador
                    jugadores[i] = jugadores[i] + tirada;

                    //Pintar dónde está
                    System.out.println("Jugador " + (i+1) + ": " + (jugadores[i]+1));

                    //Comprobar dónde está -------------------
                    //MUERTE
                    if (jugadores[i]+1 == muerte) {
                        System.out.println("Has muerto");
                        jugadores[i] = -10;
                        continue;
                    }
                    //DADOS
                    if (jugadores[i]+1 == dados[0]) {
                        jugadores[i] = dados[1]-1;
                        //Tira otra vez
                        System.out.println("DADO - Tira otra vez");
                        i--;
                        continue;
                    }
                    if (jugadores[i]+1 == dados[1]) {
                        jugadores[i] = dados[0]-1;
                        //Tira otra vez
                        System.out.println("DADO - Tira otra vez");
                        i--;
                        continue;
                    }
                    //PUENTES
                    if (jugadores[i]+1 == puentes[0]) {
                        jugadores[i] = puentes[1]-1;
                        //Tira otra vez
                        System.out.println("PUENTE - Tira otra vez");
                        i--;
                        continue;
                    }
                    if (jugadores[i]+1 == puentes[1]) {
                        jugadores[i] = puentes[0]-1;
                        //Tira otra vez
                        System.out.println("PUENTE - Tira otra vez");
                        i--;
                        continue;
                    }
                    //OCAS
                    for(int j=0; j<ocas.length; j++) {
                        if (jugadores[i]+1 == ocas[j]) {
                            jugadores[i] = ocas[j+1]-1;
                            //Tirar otra vez
                            System.out.println("OCA - Tira otra vez");
                            i--;
                            break;
                        }
                    }

                    //FIN
                    if (jugadores[i]+1 == 63 ) {
                        System.out.println("Jugador " + (i-1) + " has ganado");
                        return;
                    }
                    //Volver para atrás
                    if (jugadores[i]+1 > 63 ) {
                        jugadores[i] = 63 - (jugadores[i]+1 + tirada - 63);

                        //(posicion + tirada) - (sobra)
                        //sobra = (posicion + tirada) - 63
                        //posicion = 63 - (posicion + tirada - 63)
                    }

                }

            }

            System.out.println("Presiona ENTER para continuar");
            sc.nextLine();
            /*

            //Comprobar dónde está -------------------
            //MUERTE
            if (jugadores[0]+1 == muerte) {
                System.out.println("Has muerto");
                jugadores[0] = -10;
            }
            //DADOS
            if (jugadores[0]+1 == dados[0]) {
                jugadores[0] = dados[1]-1;
                //Tira otra vez
            }
            if (jugadores[0]+1 == dados[1]) {
                jugadores[0] = dados[0]-1;
                //Tira otra vez
            }
            //PUENTES
            if (jugadores[0]+1 == puentes[0]) {
                jugadores[0] = puentes[1]-1;
                //Tira otra vez
            }
            if (jugadores[0]+1 == puentes[1]) {
                jugadores[0] = puentes[0]-1;
                //Tira otra vez
            }
            //OCAS
            for(int i=0; i<ocas.length; i++) {
                if (jugadores[0]+1 == ocas[i]) {
                    jugadores[0] = ocas[i+1]-1;
                    //Tirar otra vez
                    break;
                }
            }
            */


        }






    }
}
