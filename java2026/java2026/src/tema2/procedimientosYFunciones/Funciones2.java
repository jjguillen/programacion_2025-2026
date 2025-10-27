package tema2.procedimientosYFunciones;

import java.util.Scanner;

public class Funciones2 {

    public static int tirarDado(int numCaras) {
        int resultado;
        resultado = (int) (Math.random() * numCaras) + 1;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoDado;
        int tirada=1;

        System.out.println("Bienvenido a D&D");
        System.out.println("Dime tipo de dado a lanzar ");

        System.out.println("1. Dado de 6 caras");
        System.out.println("2. Dado de 8 caras");
        System.out.println("3. Dado de 12 caras");
        System.out.println("4. Dado de 20 caras");
        tipoDado = Integer.parseInt(sc.nextLine());

        switch (tipoDado) {
            case 1:
                tirada = tirarDado(6);
                System.out.print("Dado de 6 caras = ");
                break;
            case 2:
                tirada = tirarDado(8);
                System.out.print("Dado de 8 caras = ");
                break;
            case 3:
                tirada = tirarDado(12);
                System.out.print("Dado de 12 caras = ");
                break;
            case 4:
                tirada = tirarDado(20);
                System.out.print("Dado de 20 caras = ");
                break;
        }

        System.out.println("Tu tirada es " + tirada);

    }
}
