package tema2.bucles;

public class EjercicioBucles7 {
    public static void main(String[] args) {

        //Cuántos números hay que sean múltiplos de 3 pero no de 5 entre 100 y 200
        int contadorMultiplos3 = 0;
        for(int i = 100; i <= 200; i++) {
            if(i % 3 == 0 && i % 5 != 0) {
                System.out.println("Encontrado el " + i);
                contadorMultiplos3++;
            }
        }

        System.out.println("Entre 100 y 200 hay " + contadorMultiplos3 + " múltiplos de 3 pero no de 5");


    }
}
