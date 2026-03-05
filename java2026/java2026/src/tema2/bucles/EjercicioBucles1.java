package tema2.bucles;

import java.util.Scanner;

public class EjercicioBucles1 {
    public static void main(String[] args) {

        //1. Lanza un dado (1-6) de forma aleatoria hasta que salga un 6.
        //   Cuenta el número de veces que hubo que tirar el dado para que saliera 6
        // contador=0
        // do {
        //     Lanzar el dado --> int n = (int) (Math.random() * 6) + 1;
        //     Pintar tirada y ver si es 6
        //     contador++ --> veces que se tira el dado
        // } while el dado no es 6

        Scanner sc = new Scanner(System.in);
        int contador = 0; //Variable para ver las veces que entro al bucle
        int tirada = 0;
        do {
            //System.out.println("Tira el dado (enter)");
            //sc.nextLine();

            tirada = (int) (Math.random() * 20) + 1; //1-20

            System.out.println("Tirada: " + tirada);
            contador++;
        } while (tirada != 20); //Termina si la tirada es 20

        System.out.println("Se tiró el dado " + contador + " veces");

        //El bucle se ejecuta hasta que la tirada es 6

        //OTRA MANERA --> USANDO BREAK
        contador = 0; //Variable para ver las veces que entro al bucle
        tirada = 0;
        do {
            tirada = (int) (Math.random() * 20) + 1; //1-20
            System.out.println("Tirada: " + tirada);
            contador++;

            if (tirada == 6) {
                break;          //El bucle acaba si la tirada es 6
            }
        } while (true); //Termina si la tirada es 20

        System.out.println("Se tiró el dado " + contador + " veces");

    }
}
