package tema2.bucles;

public class BucleAcumulador4 {
    public static void main(String[] args) {

        //Humerus y Cubitus se aburren el finde y van a jugar a los dados
        //Humerus tira tres dados y su puntuación es la suma de los pares
        //Cubitus tira tres dados y su puntuación es la suma de los impares
        //Si jugan 10 rondas, dime el ganador

        // dado = (int) (Math.random() * 6 + 1);

        //V.E.: tiradaDH1, tiradaDH2, tiradaDH3, tiradaDC1, tiradaDC2, tiradaDC3
        //      sumaDH, sumaDC
        //      contaRondasH, contaRondasC
        // Juegan 10 rondas
        //V.S.: Si contaRondasH > contaRondasC --> Gana Humerus
        //      Si contaRondasC > contaRondasH --> Gana Cubitus
        //      Si son iguales --> Empate

        int tiradaDH1, tiradaDH2, tiradaDH3, tiradaDC1, tiradaDC2, tiradaDC3;
        int sumaDH=0, sumaDC=0;
        int contaRondasH=0, contaRondasC=0;

        for(int i=1; i<=10000; i++) {
            tiradaDC1 = (int) (Math.random() * 6 + 1);
            tiradaDC2 = (int) (Math.random() * 6 + 1);
            tiradaDC3 = (int) (Math.random() * 6 + 1);
            System.out.println("Tirada Cubitus: " + tiradaDC1 + " - " + tiradaDC2 + " - " + tiradaDC3);

            if (tiradaDC1 % 2 == 1) {
                sumaDC += tiradaDC1;
            }
            if (tiradaDC2 % 2 == 1) {
                sumaDC += tiradaDC2;
            }
            if (tiradaDC3 % 2 == 1) {
                sumaDC += tiradaDC3;
            }

            System.out.println("Cubitus: " + sumaDC);

            tiradaDH1 = (int) (Math.random() * 6 + 1);
            tiradaDH2 = (int) (Math.random() * 6 + 1);
            tiradaDH3 = (int) (Math.random() * 6 + 1);
            System.out.println("Tirada Humerus: " + tiradaDH1 + " - " + tiradaDH2 + " - " + tiradaDH3);

            if (tiradaDH1 % 2 == 0) {
                sumaDH += tiradaDH1;
            }
            if (tiradaDH2 % 2 == 0) {
                sumaDH += tiradaDH2;
            }
            if (tiradaDH3 % 2 == 0) {
                sumaDH += tiradaDH3;
            }

            System.out.println("Humerus: " + sumaDH);

            //Determinar ganador de ronda
            if (sumaDH > sumaDC) {
                contaRondasH++;
                System.out.println("Humerus gana");
            } else if (sumaDC > sumaDH) {
                contaRondasC++;
                System.out.println("Cubitus gana");
            } else {
                System.out.println("Empate");
            }

            sumaDH=0;
            sumaDC=0;
        }

        System.out.println("Cubitus gana " + contaRondasC + " veces");
        System.out.println("Humerus gana " + contaRondasH + " veces");

        if (contaRondasH > contaRondasC) {
            System.out.println("Humerus gana");
        } else if (contaRondasC > contaRondasH) {
            System.out.println("Cubitus gana");
        } else {
            System.out.println("Empate");
        }






    }
}
