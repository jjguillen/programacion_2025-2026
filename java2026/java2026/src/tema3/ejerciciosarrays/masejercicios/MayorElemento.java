package tema3.ejerciciosarrays.masejercicios;

public class MayorElemento {
    public static void main(String[] args) {

        //Dado un array de enteros, encuentra el mayor elemento
        //Mejora: encuentra el segundo mayor elemento

        int[] numeros = {1,55,5,116,71,14,22,99,21,67,43};

        int mayor = numeros[0];
        int segundoMayor = numeros[0];
        for(int i=1; i < numeros.length; i++) {
            //Mayor
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            System.out.println("Por ahora el mayor es: " + mayor + "");
        }

        for(int i=1; i < numeros.length; i++) {
            //Segundo mayor
            if (numeros[i] > segundoMayor && numeros[i] != mayor) {
                segundoMayor = numeros[i];
            }
            System.out.println("Por ahora el segundo mayor es: " + segundoMayor + "");

        }



        System.out.println("El mayor elemento es: " + mayor + "");
        System.out.println("El segundo mayor elemento es: " + segundoMayor + "");


    }
}
