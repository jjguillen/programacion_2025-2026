package tema3;

public class TempHum {

    /**
     * Función que genera un número aleatorio entre 1 y max
     * @param max
     * @return
     */
    public static double generarNumero(int max, int min) {
        return (Math.random() * (max - min + 1)) + min;
    }

    /**
     * Función que imprime un array de double
     * @param array
     */
    public static void imprimirArray(double[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {

        //Rellenar un array de 100 elementos de tipo double con valores
        //aleatorios de temperatura entre -20 y 40

        //Rellenar un array de 100 elementos de tipo double con valores
        //aleatorios de humedad entre 0 y 100

        //Haz un programa que muestre por pantalla la temperatura y la humedad
        //media conforme vas generando valores aleatorios

        //Si la temperatura media es superior a 25 grados en algún momento debe
        //parar el bucle y mostrar un mensaje indicando que ha superado la temperatura
        //media permitida.

        double[] temperaturas = new double[100];
        double[] humedades = new double[100];
        double acumuladorTemp = 0, acumuladorHum = 0;

        for(int i=0; i < temperaturas.length; i++) {
            temperaturas[i] = generarNumero(40,-20);
            humedades[i] = generarNumero(100,1);

            acumuladorTemp += temperaturas[i];
            acumuladorHum += humedades[i];

            //Cantidad actual de elementos -> i+1
            System.out.println("Temperatura media actual: " + (acumuladorTemp /
                    (i+1)));
            System.out.println("Humedad media actual: " + (acumuladorHum /
                    (i+1)));

            //Alarma si tempmedia > 25
            if ((acumuladorTemp / (i+1) > 25) && ( i > 1) ){
                System.out.println("Ha superado la temperatura media permitida");
                break;
            }

        }

        //imprimirArray(temperaturas);
        //imprimirArray(humedades);




    }
}
