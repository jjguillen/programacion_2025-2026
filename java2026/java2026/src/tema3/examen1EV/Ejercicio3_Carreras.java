package tema3.examen1EV;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3_Carreras {
    public static int LONGITUD_PISTA = 50, NUM_CABALLOS = 5, MAX_AVANCE = 6,
                      APUESTA_MAXIMA = 100;

    /**
     * Generar entero aleatorio en un rango
     * @param min
     * @param max
     * @return
     */
    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Mostramos el estado de la pista
     * @param posiciones
     * @param nombres
     */
    public static void mostrarPista(int[] posiciones, String[] nombres, int turno) {
        System.out.println("============ TURNO " + turno + " =============");
        for (int i = 0; i < posiciones.length; i++) {
            System.out.printf("Caballo %d (%-15s): ",(i+1), nombres[i]);
            //Pintar avance caballo
            System.out.printf("|%-50s | Pos: %2d%n", "-".repeat(posiciones[i]), posiciones[i]);
        }
        System.out.printf("%29c%d%50c%d%n", ' ', 0, ' ', 50);


    }

    /**
     * Avanza los caballos aleatoriamente
     * @param posiciones
     */
    public static void avanzarCaballos(int[] posiciones) {
        for (int i=0; i<NUM_CABALLOS; i++){
            posiciones[i] += generarAleatorio(1, MAX_AVANCE);
        }
    }

    /**
     * Si hay un caballo ganador devuelve su número, si no -1
     * @param posiciones
     * @return
     */
    public static int determinarGanador(int[] posiciones) {
        for(int i=0; i<NUM_CABALLOS; i++){
            if (posiciones[i] >= LONGITUD_PISTA)  {
                return i+1;
            }
        }
        return -1;
    }

    /**
     * Devuelve un array con los tres primeros en orden
     * Devuelve las posiciones de los tres primeros
     * @param posiciones
     * @return
     */
    public static int[] obtenerPodio(int[] posiciones) {
        int[] podio = new int[3];
        int pos1=-1, pos2=-1, pos3=-1, mayor1, mayor2, mayor3;
        mayor1 = Integer.MIN_VALUE;
        mayor2 = Integer.MIN_VALUE;
        mayor3 = Integer.MIN_VALUE;
        for (int i=1; i<posiciones.length; i++){
            if (posiciones[i] > mayor1) {
                mayor3 = mayor2; pos3 = pos2;
                mayor2 = mayor1; pos2 = pos1;
                mayor1 = posiciones[i]; pos1 = i;
            } else if (posiciones[i] > mayor2) {
                mayor3 = mayor2; pos3 = pos2;
                mayor2 = posiciones[i]; pos2 = i;
            } else if (posiciones[i] > mayor3) {
                mayor3 = posiciones[i]; pos3 = i;
            }
        }

        podio[0] = pos1;
        podio[1] = pos2;
        podio[2] = pos3;
        return podio;
    }

    public static void mostrarEstadisticasCarrera(int[] posiciones, int turnos) {
        int total = 0;
        for(int i=0; i<posiciones.length; i++){
            total += posiciones[i];
        }

        System.out.println(" ESTADÍSTICAS CARRERAS");
        System.out.println("  - Turnos totales: " + turnos);
        System.out.println("  - Media recorrida: " + ((double) total/posiciones.length));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turno = 1;
        String[] nombres = {"Veloz", "Gandulete", "Rayo", "Alonso", "Manolo"};
        int numCaballoApuesta;
        int cantidadApuesta;

        System.out.println("Ingrese el número del caballo por el que apuesta: ");
        numCaballoApuesta = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la cantidad a apostar: ");
        cantidadApuesta = Integer.parseInt(sc.nextLine());

        //Donde está cada caballo
        int[] posiciones = new int[NUM_CABALLOS];

        while(true){
            avanzarCaballos(posiciones);

            //Si no hay ganador pinto la carrera
            if (determinarGanador(posiciones) == -1){
                mostrarPista(posiciones, nombres, turno);
            } else { //Si hay ganador salgo y lo pinto
                break;
            }

            turno++;

            System.out.println("Pulsa para continuar...");
            sc.nextLine();
        }

        //Final
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("RESULTADO FINAL");
        for (int i = 0; i < NUM_CABALLOS; i++) {
            System.out.println("Caballo " + (i + 1) + ": " + nombres[i] + ": "
                    + posiciones[i] + " casillas");
        }
        System.out.println("--------------------" +
                "------------------------------------------");
        int[] podio = obtenerPodio(posiciones);
        System.out.println("PODIO");
        for (int i = 0; i < podio.length; i++) {
            System.out.println("Posición " + (i+1) + ": Caballo " + (podio[i]+1) + " -> casilla " + posiciones[podio[i]]);
        }
        System.out.println("--------------------------------------------------------------");
        mostrarEstadisticasCarrera(posiciones, turno);

        System.out.println("--------------------------------------------------------------");
        System.out.println("APUESTAS");
        System.out.println("Tu apuesta por el caballo: " + numCaballoApuesta + " de " + cantidadApuesta +" €");
        if (numCaballoApuesta == podio[0]+1) {
            System.out.println("Ganaste, te llevas: " + (cantidadApuesta * 3) + " €");
        } else if (numCaballoApuesta == podio[1]+1) {
            System.out.println("Ganas lo apostado, quedó segundo " + cantidadApuesta + " €");
        } else {
            System.out.println("Pierdes tus " + cantidadApuesta + " €");
        }


    }
}
