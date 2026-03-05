package tema2.condicionales;

import java.util.Scanner;

public class EjercicioIf1 {
    public static void main(String[] args) {

        //Determinar si eres elegible para que te den un crédito
        //1. Tienes más de 5 años de antiguedad en el banco e ingresos mensuales de
        //   más de 2500€
        //2. Tienes una antigüedad entre 2 y 5 años, ingresos de más de 2000€ mensuales
        //   y no tienes deudas pendientes
        //3. Tienes menos de 2 años de antiguedad, un ingreso de más de 3000€ mensuales
        //   y no tienes deudas pendientes

        //V.E.: antiguedad, ingresosMensuales, deudasPendentes
        //V.S.: decir si eres elegible para que te den un crédito o no

        int antiguedad, ingresosMensuales;
        boolean deudasPendientes;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime si tienes deudas pendientes : ");
        deudasPendientes = sc.nextBoolean();
        System.out.println("Dime la antiguedad: ");
        antiguedad = sc.nextInt();
        System.out.println("Dime los ingresos mensuales: ");
        ingresosMensuales = sc.nextInt();

        if ( (antiguedad > 5 && ingresosMensuales > 2500) ||
             (antiguedad >= 2 && antiguedad <= 5 && !deudasPendientes) ||
             (antiguedad < 2 && ingresosMensuales > 3000 && !deudasPendientes) ) {
            System.out.println("Te podemos dar el crédito");
        } else {
            System.out.println("Lo sentimos, no te podemos dar el crédito");
        }

        if (antiguedad > 5 && ingresosMensuales > 2500) {
            System.out.println("Te podemos dar el crédito");
        } else if (antiguedad >= 2 && antiguedad <= 5 && !deudasPendientes) {
            System.out.println("Te podemos dar el crédito");
        } else if (antiguedad < 2 && ingresosMensuales > 3000 && !deudasPendientes)  {
            System.out.println("Te podemos dar el crédito");
        } else {
            System.out.println("Lo sentimos, no te podemos dar el crédito");
        }



    }
}
