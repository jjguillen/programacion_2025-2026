package tema2.bucles;

public class EjemploDoWhile {
    public static void main(String[] args) {

        //DO-WHILE: igual que el WHILE pero se ejecuta al menos una vez el contador
        //Números de 1 al 10

        int contador = 1;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 10);

        contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

    }
}
