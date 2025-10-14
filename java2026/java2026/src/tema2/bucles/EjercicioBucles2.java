package tema2.bucles;

public class EjercicioBucles2 {
    public static void main(String[] args) {
        //Lanza dos dados (1-6) mientras sean diferentes
        //Cuenta las veces que has tenido que tirar los dados hasta que han salido iguales

        int tirada1, tirada2;
        int contador = 0;

        do {
            tirada1 = (int) (Math.random() * 6) + 1;
            tirada2 = (int) (Math.random() * 6) + 1;
            System.out.println("Tiradas: " + tirada1 + " - " + tirada2);

            contador++; //Ver las veces que entra al bucle, las tiradas

        } while (tirada1 != tirada2);

        System.out.println("He tenido que lanzar " + contador + " veces hasta salir iguales");



    }
}
