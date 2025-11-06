package tema2.examen;

import java.util.Scanner;

public class Ejercicio2 {

    // function : genera un número aleatorio entre 1 y n
    public static int aleatorio(int n) {
        int resultado;
        resultado = (int) (Math.random() * n) + 1;
        return resultado;
    }

    //  function calcular puntos de Merlinus
    public static int calcularPuntuacionMerlinus() {
        // variables
        int dado1, dado2, dado3;
        int sumTotal = 0;

        dado1 = aleatorio(8);
        dado2 = aleatorio(8);
        dado3 = aleatorio(8);

        if (dado1 > 4) {
            sumTotal += dado1;
        }

        if (dado2 > 4) {
            sumTotal += dado2;
        }

        if (dado3 > 4) {
            sumTotal += dado3 ;
        }

        return sumTotal ;
    }

    //  function calcular puntos de Gandolfus
    public static int calcularPuntuacionGandolfus() {
        // variables
        int dado1, dado2;
        int sumTotal = 0;

        dado1 = aleatorio(12);
        dado2 = aleatorio(12);

        if (dado1 <= 6) {
            sumTotal += dado1;
        }

        if (dado2 <= 6) {
            sumTotal += dado2;
        }



        return sumTotal ;
    }


    public static void main(String[] args) {
        /*
            OPCIÓN 2
            Batalla de Magos Dos magos, Merlinus y Gandolfus, se enfrentan en un duelo mágico. Pide por teclado el número de rondas que van a combatir. En cada ronda:
            · Merlinus lanza tres dados de 8 caras y suma los valores sólo si son mayores que 4
            · Gandolfus lanza dos dados de 12 caras y suma los valores si son menores o iguales a 6.
            Gana la ronda el mago que obtenga más puntos. Gana el duelo el mago que haya ganado más
            rondas. Si hay empate en rondas, gana quien tenga más puntos totales acumulados.
            ¿Es un duelo equitativo? ¿Cómo lo comprobarías mediante simulación?

         */

        // variables
        int numRondas = 0;
        int ganadasMerlinus=0, ganadasGandolfus=0;
        int puntosMerlinus=0, puntosGandolfus=0;
        int teradaMerlinus, teradaGandolfus;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Dime el número rondas del juego: ");
                numRondas = sc.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("escribe la numero solo");
                sc = new Scanner(System.in);
                continue;
            }
        }


        for (int i = 1; i <= numRondas ; i++) {

            teradaMerlinus = calcularPuntuacionMerlinus();
            teradaGandolfus = calcularPuntuacionGandolfus();

            System.out.println("Terada Merlinus es : " + teradaMerlinus);
            System.out.println("Terada Gandolfus es : " + teradaGandolfus);


            if (teradaMerlinus > teradaGandolfus){
                System.out.println("Merlinus es gana --> " + teradaMerlinus);
                ganadasMerlinus++;
                puntosMerlinus += teradaMerlinus;

            } else if (teradaMerlinus < teradaGandolfus) {
                System.out.println("Gandolfus es gana --> " + teradaGandolfus);
                ganadasGandolfus++;
                puntosGandolfus += teradaGandolfus;

            } else {
                System.out.println("Empate");
            }

        }

        if (ganadasMerlinus > ganadasGandolfus) {
            System.out.println("gana de rondas es Merlinus ---> " + ganadasMerlinus);
        } else if (ganadasMerlinus < ganadasGandolfus) {
            System.out.println("gana de rondas es Gandolfus ---> " + ganadasGandolfus);
        } else {

            System.out.println("Empate rondas :" + ganadasMerlinus + ":" + ganadasGandolfus);

            if (puntosMerlinus > puntosGandolfus) {
                System.out.println("gana de puntos es Merlinus ---> " + puntosMerlinus);
            } else if (puntosMerlinus < puntosGandolfus) {
                System.out.println("gana de puntos es Gandolfus ---> " + puntosGandolfus);
            } else {
                System.out.println("Empate puntos : " + puntosMerlinus + ":" + puntosGandolfus);
            }
        }

    }
}
