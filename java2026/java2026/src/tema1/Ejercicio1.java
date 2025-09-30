package tema1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Dados los catetos de un triángulo calcular su hipotenusa y mostrarla
        //ANÁLISIS:
        //VARIABLES DE ENTRADA: double cateto1, cateto2
        //VARIABLES DE SALIDA: double hipotenusa

        //DISEÑO:
        // hipotenusa = raízcuadrada ( cateto1 * cateto1 + cateto2 * cateto2 )

        double cateto1,cateto2;
        double hipotenusa;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor del cateto: ");
        cateto1 = sc.nextDouble();
        System.out.println("Ingrese el valor del cateto2: ");
        cateto2 = sc.nextDouble();

        hipotenusa = Math.sqrt( Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La hipotenusa es: " + hipotenusa);








    }
}
