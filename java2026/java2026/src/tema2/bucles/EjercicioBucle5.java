package tema2.bucles;

public class EjercicioBucle5 {
    public static void main(String[] args) throws InterruptedException {

        int contador = 10;
        do {
            System.out.print(--contador);
            Thread.sleep(1000);
            System.out.print("\b");
        } while (contador > 0);
    }
}
