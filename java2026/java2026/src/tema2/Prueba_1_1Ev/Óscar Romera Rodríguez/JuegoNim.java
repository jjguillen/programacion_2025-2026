package Examen;

import java.util.Scanner;

public class JuegoNim {

    static void main() {

        int cerillasTotal = 21;
        int cerillasUsuario = 0;
        int cerillasOrdenador = 0;

        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.println("Turno usuario");

                System.out.println("Cuantas cerillas quieres retirar: (1, 2 o 3)");
                cerillasUsuario = sc.nextInt();

                if (cerillasUsuario < 1 || cerillasUsuario > 3) {
                    System.out.println("Minimo 1, Maximo 4");
                }
                if (cerillasUsuario == 1) {
                    cerillasTotal = cerillasTotal - cerillasUsuario;
                    System.out.println("Quedan " + cerillasTotal + " cerillas");
                }
                if (cerillasUsuario == 2) {
                    cerillasTotal = cerillasTotal - cerillasUsuario;
                    System.out.println("Quedan " + cerillasTotal + " cerillas");
                }
                if (cerillasUsuario == 3) {
                    cerillasTotal = cerillasTotal - cerillasUsuario;
                    System.out.println("Quedan " + cerillasTotal + " cerillas");
                }

                if (cerillasTotal < 1) {
                    System.out.println("El usuario pierde");
                    return;
                }

                System.out.println("Turno ordenador");

                cerillasOrdenador = (int) (Math.random() * 3) + 1;
                System.out.println(cerillasOrdenador);

                cerillasTotal = cerillasTotal - cerillasOrdenador;
                System.out.println("Quedan " + cerillasTotal + " cerillas");

                if (cerillasTotal < 1) {
                    System.out.println("El ordenador pierde");
                    return;
                }
            } while (true);
        }catch(Exception exc){
            System.out.println("Valor incorrecto " + exc);
        }
    }
}
