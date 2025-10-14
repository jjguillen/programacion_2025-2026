package tema2.bucles;

public class EjemploBucle1 {
    public static void main(String[] args) {

        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador++; //Acercarnos a que se cumpla la condición de fin del bucle
        }

        //Saca en un bucle los números del -10 al 10
        contador = -10;
        while (contador <= 10) {
            System.out.println(contador);
            contador++; //Acercarnos a que se cumpla la condición de fin del bucle
        }

        //Cuenta atrás del 10 al 1
        contador = 10;
        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }

        System.out.println("Final del programa");


    }
}
