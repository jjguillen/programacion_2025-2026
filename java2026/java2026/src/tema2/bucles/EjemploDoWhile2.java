package tema2.bucles;

public class EjemploDoWhile2 {
    public static void main(String[] args) {


        int contador = 1;
        do {
            System.out.print(contador++ + ", ");
        } while (contador <= 10);

        System.out.println();

        contador = 10;
        do {
            System.out.print(contador-- + ", "); //Primero pinta luego resta 1
        } while (contador >= 1);

        System.out.println();

        contador = 11;
        do {
            System.out.print(--contador + ", "); //Primero resta 1 luego pinta
        } while (contador > 1);


    }
}
