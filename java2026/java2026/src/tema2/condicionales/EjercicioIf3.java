package tema2.condicionales;

import java.util.Scanner;

public class EjercicioIf3 {
    public static void main(String[] args) {

        /**
        El director de una escuela está organizando un viaje de estudios, y requiere
        determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía
        de viajes por el servicio. La forma de cobrar es la siguiente:
            - si son 100 alumnos o más, el costo por cada alumno es de 65 euros
            - de 50 a 99 alumnos, el costo es de 70 euros por alumno
            - de 30 a 49, de 95 euros por alumno
            - si son menos de 30, el costo de la renta del autobús es de 4000 euros,
            sin importar el número de alumnos.

         Realice un algoritmo que permita determinar el pago a la compañía de autobuses
         y lo que debe pagar cada alumno por el viaje.
        */

        //V.E.: numAlumnosViaje
        //V.S.: costeTotal, costePorAlumno

        long numAlumnosViaje;
        double costeTotal=0, costePorAlumno=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de alumnos del viaje ");
        numAlumnosViaje = sc.nextInt();

        if (numAlumnosViaje > 100) {
            costePorAlumno = 65;
        } else if (numAlumnosViaje >= 50 && numAlumnosViaje <= 99) {
            costePorAlumno = 70;
        } else if (numAlumnosViaje >= 30 && numAlumnosViaje <= 49) {
            costePorAlumno = 95;
        } else {
            costeTotal = 4000;
            costePorAlumno = 4000.0 / numAlumnosViaje;
        }

        if (numAlumnosViaje >= 30) {
            costeTotal = costePorAlumno * numAlumnosViaje;
        }

        System.out.println("El coste de la viaje es: " + costeTotal);
        System.out.println("El coste por alumno es: " + costePorAlumno);


    }
}
