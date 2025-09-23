package tema1;

import java.util.Scanner;

public class EjemploClase {
    public static void main(String[] args) {
        //EJERCICIO CLASE
        //Tenemos que diseñar un programa que pida por teclado tres temperaturas
        //Tiene que mostrar como salida la temperatura media de esas tres
        //Realizar análisis, diseño y codificación

        //ANALISIS
        //Variables entrada: tres temperaturas tipo double
        //Variables salida: una temperatura media tipo double

        //DISEÑO
        //Temperatura media -> (t1 + t2 + t3) / 3

        //CODIFICACION
        //1.Declaración variables
        double temp1, temp2, temp3;
        double tempMedia;

        //2.Entrada teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime primera temperatura");
        temp1 = sc.nextDouble();
        System.out.println("Dime segunda temperatura");
        temp2 = sc.nextDouble();
        System.out.println("Dime tercera temperatura");
        temp3 = sc.nextDouble();

        //3.Cálculo de operacion
        tempMedia = (temp1 + temp2 + temp3) / 3;

        //4.Mostrar resultados
        System.out.println("Media final: " + tempMedia);
    }
}
