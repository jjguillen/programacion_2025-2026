package tema2.repaso;

import java.util.Scanner;

public class Cubitus4 {

    public static int tirarDado(int numCaras) {
        int resultado;
        resultado = (int) (Math.random() * numCaras) + 1;
        return resultado;
    }

    public static void main(String[] args) {

        int ganadasC=0, ganadasH=0;
        int numPartidas=0;
        int dado1C, dado2C, dado3C, dado1H, dado2H, dado3H;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime número de partidas: ");
        numPartidas = sc.nextInt();

        if (numPartidas % 2 == 1) {

            for(int i=0; i < numPartidas; i++) {
                dado1C = tirarDado(13);
                dado2C = tirarDado(13);
                dado3C = tirarDado(13);
                dado1H = tirarDado(13);
                dado2H = tirarDado(13);
                dado3H = tirarDado(13);

                //Coincide algún valor de Cubitus con alguno de Humerus
                if (dado1C == dado1H || dado1C == dado2H || dado1C == dado3H ||
                        dado2C == dado1H || dado2C == dado2H || dado2C == dado3H ||
                        dado3C == dado1H || dado3C == dado2H || dado3C == dado3H) {
                    ganadasC++;
                } else {
                    ganadasH++;
                }
            }

            System.out.println("Cubitus gana " + ganadasC + " partidas");
            System.out.println("Humerus gana " + ganadasH + " partidas");

            if (ganadasC > ganadasH) {
                System.out.println("Cubitus gana");
            } else if (ganadasH > ganadasC) {
                System.out.println("Humerus gana");
            }

        } else {
            System.out.println("Número de partidas debe ser impar, lo siento");
            return;
        }

/*
        if ( !(d1 == 1 || d2 == 1 || d3 == 1 || d4 == 1 || d5 == 1) &&
           (d1 == 2 || d2 == 2 || d3 == 2 || d4 == 2 || d5 == 2) &&
           (d1 == 3 || d2 == 3 || d3 == 3 || d4 == 3 || d5 == 3) &&
           (d1 == 4 || d2 == 4 || d3 == 4 || d4 == 4 || d5 == 4) &&
           (d1 == 5 || d2 == 5 || d3 == 5 || d4 == 5 || d5 == 5) &&
           (d1 == 6 || d2 == 6 || d3 == 6 || d4 == 6 || d5 == 6) {

        }
*/
    }
}
