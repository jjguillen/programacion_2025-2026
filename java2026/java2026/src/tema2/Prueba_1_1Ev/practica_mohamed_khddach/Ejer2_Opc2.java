package tema2.Prueba_1_1Ev.practica_mohamed_khddach;

import java.util.Scanner;

public class Ejer2_Opc2 {

    /**
     * Dos magos, Merlinus y Gandolfus, se enfrentan en un duelo mágico. Pide por teclado el número
     * de rondas que van a combatir. En cada ronda:
     * · Merlinus lanza tres dados de 8 caras y suma los valores sólo si son mayores que 4
     * · Gandolfus lanza dos dados de 12 caras y suma los valores si son menores o iguales a 6.
     * Gana la ronda el mago que obtenga más puntos. Gana el duelo el mago que haya ganado más
     * rondas. Si hay empate en rondas, gana quien tenga más puntos totales acumulados.
     * ¿Es un duelo equitativo? ¿Cómo lo comprobarías mediante simulación?
     * @param args
     */

    /**
     * Función que simula tirar un dado de numCaras caras
     * @param numCaras
     * @return
     */
    public static int tirarDado(int numCaras) {
        int resultado;
        resultado = (int) (Math.random() * numCaras) + 1;
        return resultado;
    }

    public static void main(String[] args) {

        int numRondas=0;
        int dadoM1, dadoM2, dadoM3;
        int dadoG1, dadoG2;
        int totalRondaM=0;
        int totalRondaG=0;
        int totalM=0, totalG=0;
        int numRondasM=0, numRondasG=0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de rondas que van a jugar: ");

        //Número de rondas mayor que 0
        do {
            try {
                numRondas = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                System.out.println("Número incorrecto");
            }
        } while(numRondas <= 0);

        //A jugar
        while(numRondas > 0) {
            //Juega Merlinus
            dadoM1 = tirarDado(8);
            dadoM2 = tirarDado(8);
            dadoM3 = tirarDado(8);
            if (dadoM1 > 4) {
                totalRondaM += dadoM1;
            }
            if (dadoM2 > 4) {
                totalRondaM += dadoM2;
            }
            if (dadoM3 > 4) {
                totalRondaM += dadoM3;
            }

            //Juega Gandolfus
            dadoG1 = tirarDado(12);
            dadoG2 = tirarDado(12);
            if (dadoG1 <= 6) {
                totalRondaG += dadoG1;
            }
            if (dadoG2 <= 6) {
                totalRondaG += dadoG2;
            }

            //Actualizar total acumulado
            totalM += totalRondaM;
            totalG += totalRondaG;

            //Mostrar ronda
            System.out.println("Ronda " + numRondas);
            System.out.println("Merlinus dado1: " + dadoM1 + " dado2: " + dadoM2 + " dado3: " + dadoM3);
            System.out.println("Merlinus total: " + totalRondaM);
            System.out.println("Gandolfus dado1: " + dadoG1 + " dado2: " + dadoG2);
            System.out.println("Gandolfus total: " + totalRondaG);
            if (totalRondaM > totalRondaG) {
                System.out.println("Merlinus gana");
                numRondasM++;
            } else if (totalRondaG > totalRondaM) {
                System.out.println("Gandolfus gana");
                numRondasG++;
            } else {
                System.out.println("Empate");
            }

            totalRondaM=0;
            totalRondaG=0;
            numRondas--;
        }

        //Recopilación de rondas
        System.out.println("RESULTADO FINAL");
        System.out.println("Total Merlinus: " + numRondasM);
        System.out.println("Total Gandolfus: " + numRondasG);
        if (numRondasM > numRondasG) {
            System.out.println("Merlinus gana");
        } else if (numRondasG > numRondasM) {
            System.out.println("Gandolfus gana");
        } else {
            System.out.println("Empate");
            if (totalM > totalG) {
                System.out.println("Merlinus gana");
            } else if (totalG > totalM) {
                System.out.println("Gandolfus gana");
            } else {
                System.out.println("Empate a lo bestia");
            }
        }

    }
}
