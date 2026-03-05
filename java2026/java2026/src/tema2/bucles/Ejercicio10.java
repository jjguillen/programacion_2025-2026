package tema2.bucles;

public class Ejercicio10 {
    public static void main(String[] args) {

        //Lanza dos dados de 12 caras 100 veces
        //Di cuántas veces salen los dos dados iguales

        int tirada1, tirada2;
        int salenIguales=0;

        for(int i=0; i<100; i++) {
            tirada1 = (int) (Math.random() * 12) + 1;
            tirada2 = (int) (Math.random() * 12) + 1;

            System.out.println("Tirada 1: " + tirada1);
            System.out.println("Tirada 2: " + tirada2);

            if (tirada1 == tirada2) {
                salenIguales++;
                System.out.println("Son iguales");
            }
        }

        System.out.println("Han salido " + salenIguales + " veces los dos dados iguales");
    }
}
