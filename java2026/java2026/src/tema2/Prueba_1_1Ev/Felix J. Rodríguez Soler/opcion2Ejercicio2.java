package examen;

import java.util.Scanner;

public class opcion2Ejercicio2 {
    public static void main(String[] args) {

        //Dos magos, Merlinus y Gandolfus, se enfrentan en un duelo mágico. Pide por teclado el número
        //de rondas que van a combatir. En cada ronda:
        //· Merlinus lanza tres dados de 8 caras y suma los valores sólo si son mayores que 4
        //· Gandolfus lanza dos dados de 12 caras y suma los valores si son menores o iguales a 6.
        //Gana la ronda el mago que obtenga más puntos. Gana el duelo el mago que haya ganado más
        //rondas. Si hay empate en rondas, gana quien tenga más puntos totales acumulados.
        //¿Es un duelo equitativo? ¿Cómo lo comprobarías mediante simulación?

        int tiradaM1, tiradaM2, tiradaM3, tiradaG1, tiradaG2;
        int rondas = 0;
        int sumaM = 0, sumaG = 0;
        int puntosM = 0, puntosG = 0;
        int acumuladorM = 0, acumuladorG = 0;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Cuantas rondas se van a jugar?: ");
            rondas = sc.nextInt();

            for (int i = 1; i <= rondas; i++) {
                tiradaM1 = (int) (Math.random() * 8) + 1;
                tiradaM2 = (int) (Math.random() * 8) + 1;
                tiradaM3 = (int) (Math.random() * 8) + 1;
                tiradaG1 = (int) (Math.random() * 12) + 1;
                tiradaG2 = (int) (Math.random() * 12) + 1;

                if ((tiradaM1 > 4) || (tiradaM2 > 4) || (tiradaM3 > 4)) {
                    sumaM += tiradaM1 + tiradaM2 + tiradaM3;
                    sumaM += puntosM;
                }
                if ((tiradaG1 <= 6) || (tiradaG2 <= 6)) {
                    sumaG += tiradaG1 + tiradaG2;
                    sumaG += puntosG;
                }
                if (sumaM > sumaG) {
                    System.out.println("Gana la ronda Merlinus");
                    acumuladorM++;
                } else if (sumaG > sumaM) {
                    System.out.println("Gana la ronda Gandolfus");
                    acumuladorG++;
                } else if (sumaG == sumaM) {
                    if (puntosM > puntosG) {
                        System.out.println("Gana la ronda Merlinus");
                    } else if (puntosG > puntosM) {
                        System.out.println("Gana la ronda Gandolfus");
                    } else {
                        System.out.println("Empate por tener los mismos puntos");
                    }
                }

                sumaM = 0;
                sumaG = 0;
            }
        } catch (Exception exc){
            System.out.println("Error leyendo de teclado");
            return;
        }

        if (acumuladorG>acumuladorM){
            System.out.println("Gana la partida Gandolfus " + acumuladorG + " rondas");
        }else if (acumuladorG==acumuladorM){
            if (puntosM > puntosG){
                System.out.println("Gana la partida Merlinus con: " + acumuladorM + " y " + puntosM + " puntos");
            }else if (puntosG > puntosM){
                System.out.println("Gana la partida Gandolfus con: " + acumuladorG + " y " + puntosG + " puntos");
            } else {
                System.out.println("Empate por tener los mismos puntos y rondas");
            }
        } else {
            System.out.println("Gana la partida Merlinus " + acumuladorM + " rondas");
        }

        //¿Es un duelo equitativo? ¿Cómo lo comprobarías mediante simulación?
        // No es equitativo porque reduces la probabilidad de todos los dados la mitad de Gandolfus,
        // además de que tiene un dado menos. Por otro lado si Merlinus tiene 3 dados y puntua entre 5
        // y 8, entonces su puntuación es mayor siempre que acierte dos dados y Gandolfus una.
        // Se puede ver la gran diferencia al poner por ejemplo 100, 200, 300 rondas, siempre gana Merlinus.
        // Hay mas o menos un 70% de porcentaje para Merlinus y un 30% para Gandolfus

    }

}
