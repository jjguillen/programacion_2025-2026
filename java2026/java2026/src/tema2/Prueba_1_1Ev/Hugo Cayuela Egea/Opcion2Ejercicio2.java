package javat1.Examen1Hugo;
/*Batalla de Magos
Dos magos, Merlinus y Gandolfus, se enfrentan en un duelo mágico. Pide por teclado el número
de rondas que van a combatir. En cada ronda:
· Merlinus lanza tres dados de 8 caras y suma los valores sólo si son mayores que 4
· Gandolfus lanza dos dados de 12 caras y suma los valores si son menores o iguales a 6.
Gana la ronda el mago que obtenga más puntos. Gana el duelo el mago que haya ganado más
rondas. Si hay empate en rondas, gana quien tenga más puntos totales acumulados.
¿Es un duelo equitativo? ¿Cómo lo comprobarías mediante simulación? */


import java.util.Scanner;

public class Opcion2Ejercicio2 {

    public static int LanzarDado8Caras(){
        return (int) (Math.random()*8) + 1;
    }
    public static int LanzarDado12Caras(){
        return (int) (Math.random()*12) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rondas;
        boolean empatePorRondas = false;
        int puntosMer = 0, puntosGan = 0, puntosTotalesMer = 0, PuntosTotalesGan = 0;
        int rondasGanadasMer = 0, rondasGanadasGan = 0;
        int tirada1Mer, tirada2Mer, tirada3Mer, tirada1Gan, tirada2Gan;
        System.out.println("Dime cuantas rondas van a jugar");
        rondas = sc.nextInt();

        for (int i = 1; i <= rondas; i++) {
            tirada1Mer = LanzarDado8Caras();
            tirada2Mer = LanzarDado8Caras();
            tirada3Mer = LanzarDado8Caras();
            tirada1Gan = LanzarDado12Caras();
            tirada2Gan = LanzarDado12Caras();
            System.out.println("Merlinus saca: " + tirada1Mer + " " + tirada2Mer + " " + tirada3Mer);
            System.out.println("Gandolfus saca: " + tirada1Gan + " " + tirada2Gan);
            if (tirada1Mer > 4) {
                puntosMer += tirada1Mer;
                puntosTotalesMer = puntosTotalesMer + tirada1Mer;
            }
            if (tirada2Mer > 4){
                puntosMer += tirada2Mer;
                puntosTotalesMer = puntosTotalesMer + tirada2Mer;
            }
            if (tirada3Mer > 4){
                puntosMer += tirada3Mer;
                puntosTotalesMer = puntosTotalesMer + tirada3Mer;
            }
            System.out.println("Merlinus tiene: " + puntosMer + " puntos");

            if (tirada1Gan <= 6) {
                puntosGan += tirada1Gan;
                PuntosTotalesGan = PuntosTotalesGan + tirada1Gan;
            }
            if (tirada2Gan <= 6) {
                puntosGan += tirada2Gan;
                PuntosTotalesGan = PuntosTotalesGan + tirada2Gan;
            }
            System.out.println("Gandolfus tiene: " + puntosGan + " puntos");
            if (puntosMer > puntosGan) {
                System.out.println("Merlinus gana la ronda");
                rondasGanadasMer++;
            } else if (puntosGan > puntosMer){
                System.out.println("Gandolfus gana la ronda");
                rondasGanadasGan++;
            } else {
                System.out.println("Empate");
            }
            puntosMer = 0;
            puntosGan = 0;
        }
        if (rondasGanadasMer > rondasGanadasGan){
            System.out.println("El ganador es Merlinus con " + rondasGanadasMer + " rondas ganadas");
        } else if (rondasGanadasGan > rondasGanadasMer){
            System.out.println("El ganador es Gandolfus con " + rondasGanadasGan + " rondas ganadas");
        } else if (rondasGanadasGan == rondasGanadasMer) {
            empatePorRondas = true;
            System.out.println("Empate en rondas");
        }
        if (empatePorRondas) {
            if (PuntosTotalesGan > puntosTotalesMer){
                System.out.println("El ganador es Gandolfus con: " + PuntosTotalesGan + " puntos");
            } else if (puntosTotalesMer > PuntosTotalesGan) {
                System.out.println("El ganador es Merlinus con: " + puntosTotalesMer + " puntos");
            }
        }
    }
}
/* No es un duelo equitativo ya que Merlinus puede sacar un total de 24 puntos y Gandolfus solo 12
 para comprobar que no es equitativo solo deberiamos poner un numero de rondas alto
 y veremos como la mayoria de las rondas las gana Merlinus */
