package tema3.ejerciciosarrays;

public class Invertido {
    public static void main(String[] args) {
        //Crea un programa que dado un array de números, guarde ese array en un
        //array nuevo invertido.

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int[] numerosInvertidos = new int[10];
        // 0 1 2 3 4 5 6 7 8 9
        //{-,-,-,-,-,-,-,3,2,1}

        for(int i=0; i < numeros.length; i++) {
            numerosInvertidos[numeros.length - i - 1] = numeros[i];
        }

        for(int i=0; i < numerosInvertidos.length; i++) {
            System.out.println(numerosInvertidos[i]);
        }

        //i - longitud - i - 1
        //i -> 10 - i - 1
        //0 -> 9
        //1 -> 10 - 1 - 1 = 8
        //2 -> 10 - 2 - 1 = 7

        for(int i=numeros.length-1; i >= 0; i--) {
            numerosInvertidos[numeros.length - i - 1] = numeros[i];
        }

        for(int i=0; i < numerosInvertidos.length; i++) {
            System.out.println(numerosInvertidos[i]);
        }


    }
}
