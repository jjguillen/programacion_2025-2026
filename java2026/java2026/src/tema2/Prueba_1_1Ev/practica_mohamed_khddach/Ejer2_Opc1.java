package tema2.Prueba_1_1Ev.practica_mohamed_khddach;

import java.util.Scanner;

public class Ejer2_Opc1 {

    /**
     * Dos jugadores (el usuario y el ordenador) comienzan con 21 cerillas. Por turnos, cada jugador
     * retira entre 1 y 3 cerillas. El jugador que retire la última cerilla pierde la partida.
     * Escribe un programa que:
     * – Permita al usuario elegir cuántas cerillas quiere retirar (validando que sea entre 1 y 3)
     * – El ordenador retire aleatoriamente entre 1 y 3 cerillas
     * – Muestre el estado del juego después de cada turno
     * – Indique quién ha ganado al finalizar
     */

    /**
     * Función que retira aleatoriamente entre 1 y 3 cerillas
     * Sería el turno del ordenador
     * @return
     */
    public static int retirarCerillasPC() {
        return (int) (Math.random() * 3 + 1);
    }

    /**
     * Función que pide al usuario un número entre 1 y 3
     * Se comprueba que esté en ese rango y que sea correcto
     * En otro caso te sigue pidiendo que escribas el número bien
     * @return
     */
    public static int retirarCerillasUsuario() {
        int numero=0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Dime el número de cerillas a retirar (1-3):");
            try {
                numero = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                System.out.println("Número incorrecto");
            }
        } while (numero < 1 || numero > 3);

        //Cerrrar Scanner cada vez que llamamos a la función
        //sc.close();

        return numero;
    }

    public static void main(String[] args) {

        int numCerillas = 21;
        int numero=0;

        System.out.println("Comienza el juego, hay 21 cerillas");

        while (true) {
            //El usuario retira entre 1 y 3 cerillas
            numero = retirarCerillasUsuario();
            System.out.println("Usuario retiro " + numero + " cerillas");
            numCerillas -= numero;
            //Comprobar si al retirar esas cerillas pierde
            if (numCerillas <= 0) {
                System.out.println("HA GANADO PC");
                break;
            } else {
                System.out.println("Quedan " + numCerillas + " cerillas");
            }

            //El PC retira entre 1 y 3 cerillas
            numero = retirarCerillasPC();
            System.out.println("PC retiro " + numero + " cerillas");
            numCerillas -= numero;
            //Comprobar si al retirar esas cerillas pierde
            if (numCerillas <= 0) {
                System.out.println("HA GANADO USUARIO");
                break;
            } else {
                System.out.println("Quedan " + numCerillas + " cerillas");
            }
        }


    }
}
