package tema2.repaso;

import java.util.Scanner;

public class Cubitus2 {

    public static int tirarDado(int numCaras) {
        int resultado;
        resultado = (int) (Math.random() * numCaras) + 1;
        return resultado;
    }

    public static int max(int n1, int n2, int n3, int n4, int n5) {
        return Math.max( Math.max( Math.max(n3, n4), Math.max(n1, n2) ) , n5);
    }

    public static int min(int n1, int n2, int n3, int n4, int n5) {
        return Math.min( Math.min( Math.min(n3, n4), Math.min(n1, n2) ) , n5);
    }


    public static int calcularPuntuacion() {
        int dado1, dado2, dado3, dado4, dado5;
        int total=0;
        int max,min;

        dado1 = tirarDado(6);
        dado2 = tirarDado(6);
        dado3 = tirarDado(6);
        dado4 = tirarDado(6);
        dado5 = tirarDado(6);

        max = max(dado1,dado2,dado3,dado4,dado5);
        min = min(dado1,dado2,dado3,dado4,dado5);

        if (dado1 != max && dado1 != min) {
            total += dado1;
        }
        if (dado2 != max && dado2 != min) {
            total += dado2;
        }
        if (dado3 != max && dado3 != min) {
            total += dado3;
        }
        if (dado4 != max && dado4 != min) {
            total += dado4;
        }
        if (dado5 != max && dado5 != min) {
            total += dado5;
        }

        System.out.println("D1: " + dado1 + " D2: " + dado2 + " D3: " + dado3 + " D4: " + dado4 + " D5: " + dado5);
        System.out.println("Max: " + max + " Min: " + min);

        return total;
    }

    public static void main(String[] args) {

        /*
        Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen
        en sus ratos libres jugando a juegos de dados, el pasatiempo favorito de
        los antiguos romanos. Un juego que pudieron haber jugado estos amigos
        consiste en tirar cada jugador cinco dados. La puntuación es la suma total
        de puntos, sin contar los valores que coincidan con el mínimo o el máximo
        obtenido. El jugador que saca más puntos gana la partida. Escriba un programa
        que simule varias partidas seguidas de este juego de dados
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de partidas a jugar: ");
        int numPartidas = sc.nextInt();
        int ganadasC=0, ganadasH=0;
        int tiradaC=0, tiradaH=0;

        for(int i=0; i < numPartidas; i++) {
            tiradaC = calcularPuntuacion();
            tiradaH = calcularPuntuacion();

            System.out.println("Tirada Cubitus: " + tiradaC);
            System.out.println("Tirada Humerus: " + tiradaH);

            if (tiradaC > tiradaH) {
                ganadasC++;
            } else if (tiradaH > tiradaC) {
                ganadasH++;
            } else {
                System.out.println("Empate");
            }
        }

        System.out.println("Cubitus gana " + ganadasC + " partidas");
        System.out.println("Humerus gana " + ganadasH + " partidas");

        if (ganadasC > ganadasH) {
            System.out.println("Cubitus gana");
        } else if (ganadasH > ganadasC) {
            System.out.println("Humerus gana");
        } else {
            System.out.println("Empate");
        }

    }
}
