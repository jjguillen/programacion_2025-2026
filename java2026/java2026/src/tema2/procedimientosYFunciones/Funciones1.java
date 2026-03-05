package tema2.procedimientosYFunciones;

public class Funciones1 {

    /**
     * Genera un número aleatorio entre 1 y 6
     * @return
     */
    public static int lanzarDado() {
        int dado;
        dado = (int) (Math.random() * 6) + 1;
        return dado;
    }

    public static void main(String[] args) {
        //Lanza dos dados (1-6) mientras sean diferentes
        //Cuenta las veces que has tenido que tirar los dados hasta que han salido iguales

        int tirada1, tirada2;
        int contador = 0;

        do {
            tirada1 = lanzarDado();
            tirada2 = lanzarDado();
            System.out.println("Tiradas: " + tirada1 + " - " + tirada2);

            contador++; //Ver las veces que entra al bucle, las tiradas

        } while (tirada1 != tirada2);

        System.out.println("He tenido que lanzar " + contador + " veces hasta salir iguales");



    }
}
