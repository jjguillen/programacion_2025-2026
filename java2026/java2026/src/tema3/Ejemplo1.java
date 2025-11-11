package tema3;

public class Ejemplo1 {

    public static void main(String[] args) {

        int vector[] = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

}
