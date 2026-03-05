package tema2.condicionales;

public class EjemploIf {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 6) + 1;
        System.out.println("Tirada " + n);

        // n == 6 si es true --> se ejecuta lo que hay dentro
        // n == 6 si es false --> no se ejecuta nada
        if (n == 6) {
            System.out.println("Has ganado!");
        } else {
            System.out.println("Lo siento, sigue intentando");
        }





    }
}
