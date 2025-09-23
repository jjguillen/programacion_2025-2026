package tema1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        //Leer el radio de un círculo y calcular e imprimir su area y
        //longitud

        //ANÁLISIS
        //Datos de entrada: radio de la circunferencia
        //Datos de salida: área y longitud de la circunferencia
        //DISEÑO
        //area = PI * radio * radio
        //longitud = PI * 2 * radio

        //1. DECLARACION DE VARIABLES
        double radio;
        double area, longitud;

        //2. LEER DATOS DE ENTRADA
        Scanner sc = new Scanner(System.in); //* Crea el objeto para leer de teclado
        System.out.println("Ingrese el radio: ");
        radio = sc.nextDouble(); //* Leer de teclado un decimal
        System.out.println("El radio es " + radio);

        //3. HACER CÁLCULOS
        area = Math.PI * Math.pow(radio,2); //PI * r2
        longitud = 2 * Math.PI * radio; //2 * PI * r

        //4. MOSTRAR RESULTADOS
        System.out.println("El area es: " + area);
        System.out.println("El longitud es: " + longitud);



    }
}
