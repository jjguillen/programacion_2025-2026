package tema3;

public class Reverse {
    public static void main(String[] args) {

        //Crea un array de 10 números de tipo double y píntalos en orden inverso
        double[] numeros = {3.4, 5.5, 2.9, 5.6, 7.8, 9.1, 3.3, 1.2, 4.5, 6.7, 8.4};

        //Si el tamaño del array es 10 --> for va de 9 a 0
        //Tamaño del array es --> numeros.length = 10
        //Empiezo: 9 -> tamaño - 1
        //Termino: 0
        //Condicion: i >= 0
        //Incremento: i--

        for(int i=numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }


        //Este for y el de abajo son iguales
        for(int i=0; i <= numeros.length-1; i++) {
            System.out.println(numeros[i]);
        }
        for(int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
