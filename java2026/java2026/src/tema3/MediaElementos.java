package tema3;

public class MediaElementos {
    public static void main(String[] args) {

        //Calcula la media de los elementos de un array

        double[] numeros = {3.4, 5.5, 2.9, 5.6, 7.8, 9.1, 3.3};

        //media = (suma de los elementos) / (contador de elementos)
        double acumulador = 0;

        for(int i=0; i < numeros.length; i++) {
            acumulador += numeros[i];
        }

        System.out.println("Total " + acumulador);
        System.out.println("Media " + (acumulador / numeros.length));



    }
}
