package tema2.condicionales;

import java.util.Scanner;

public class EjemploIf3 {
    public static void main(String[] args) {

        int mates, lengua;

        Scanner sc = new Scanner(System.in);
        System.out.println("Mates: ");
        mates = sc.nextInt();
        System.out.println("Lengua: ");
        lengua = sc.nextInt();

        if (mates >= 5 && lengua >= 5) {
            System.out.println("Todo aprobado");
        } else if (mates >= 5 && lengua < 5) {
            System.out.println("Mates aprobado, lengua no");
        } else if (mates < 5 && lengua >= 5) {
            System.out.println("Lengua aprobado, mates no");
        } else {
            System.out.println("Todo suspenso");
        }


    }
}
