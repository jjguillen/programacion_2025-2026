package tema2.bucles;

public class EjemploBucle2 {
    public static void main(String[] args) {

        //Números impares del 1 al 100, píntalos seguidos separados por comas
        //Solución 1 - Más eficiente entra menos veces al bucle
        int contador = 1;
        while (contador <= 100) {
            System.out.print(contador + ", ");
            contador += 2;
        }

        System.out.println();

        //Solución 2
        contador = 1;
        while (contador <= 100) {
            if (contador % 2 == 1) { //Solo pinto impares
                System.out.print(contador + ", ");
            }
            contador++;
        }

    }
}
