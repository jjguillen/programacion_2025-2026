package tema2.condicionales;

import java.util.Scanner;

public class EjercicioIf2 {
    public static void main(String[] args) {

        //EJERCICIO PARA DETERMINAR SI TE DAN UNA BECA Y DE QUÉ TIPO
        //Requisitos generales (deben cumplirse los dos):
        //1. No tener más de dos asignaturas suspensas
        //2. Ingresos familiares inferiores a 2000€/mes

        //Si se cumplen te van a dar un tipo de beca
        //BECA COMPLETA: si se cumple alguna de estas condiciones (OR)
        //1. Ingresos inferiores a 800€/mes
        //2. Vives en zona vulnerable
        //3. Discapacidad superior al 60%
        //BECA PARCIAL: si se cumple alguna de estas condiciones (OR)
        //1. Ingresos inferiores a 1400€/mes y Familia numerosa
        //2. Ingresos inferiores a 1100€/mes
        //3. Ingresos inferiores a 1300€/mes y vives en zona vulnerable
        //4. Discapacidad entre el 40 y 60%
        //BECA SIMPLE: si se cumple alguna de estas condiciones (OR)
        //1. Ingresos familiares entre 1400€/mes y 1800€/mes
        //2. Discapacidad entre el 20 y 40%

        //V.E.: ingresosMensualesFamilia, asignaturasSuspensas, zonaVulnerable (true/false),
        //      discapacidad(0-100), familiaNumerosa (true/false)
        //V.S.: si te dan beca o no, y en caso afirmativo qué tipo de beca

        // Declaración de variables de entrada
        double ingresosMensualesFamilia;
        int asignaturasSuspensas;
        boolean zonaVulnerable;
        int discapacidad;
        boolean familiaNumerosa;

        // Lectura de datos
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime los ingresos mensuales de la familia: ");
        ingresosMensualesFamilia = sc.nextDouble();

        System.out.println("Dime el número de asignaturas suspensas: ");
        asignaturasSuspensas = sc.nextInt();

        System.out.println("¿Vives en zona vulnerable? (true/false): ");
        zonaVulnerable = sc.nextBoolean();

        System.out.println("Dime el porcentaje de discapacidad (0-100): ");
        discapacidad = sc.nextInt();

        System.out.println("¿Es familia numerosa? (true/false): ");
        familiaNumerosa = sc.nextBoolean();

        // Verificar requisitos generales
        if (asignaturasSuspensas <= 2 && ingresosMensualesFamilia < 2000) {
            // Verificar BECA COMPLETA
            if (ingresosMensualesFamilia < 800 || zonaVulnerable || discapacidad > 60) {
                System.out.println("¡Enhorabuena! Te han concedido una BECA COMPLETA");
            }
            // Verificar BECA PARCIAL
            else if ((ingresosMensualesFamilia < 1400 && familiaNumerosa) ||
                    ingresosMensualesFamilia < 1100 ||
                    (ingresosMensualesFamilia < 1300 && zonaVulnerable) ||
                    (discapacidad >= 40 && discapacidad <= 60)) {
                System.out.println("¡Enhorabuena! Te han concedido una BECA PARCIAL");
            }
            // Verificar BECA SIMPLE
            else if ((ingresosMensualesFamilia >= 1400 && ingresosMensualesFamilia <= 1800) ||
                    (discapacidad >= 20 && discapacidad < 40)) {
                System.out.println("¡Enhorabuena! Te han concedido una BECA SIMPLE");
            }
            // No cumple ningún tipo de beca
            else {
                System.out.println("Lo sentimos, cumples los requisitos generales pero no calificas para ningún tipo de beca");
            }
        } else {
            System.out.println("Lo sentimos, no cumples los requisitos generales para optar a una beca");
        }


        //OTRA FORMA
        if (asignaturasSuspensas > 2 || ingresosMensualesFamilia >= 2000) {
            System.out.println("No cumples los requisitos generales para optar a una beca");
        } else if (ingresosMensualesFamilia < 800 || zonaVulnerable || discapacidad > 60) {
            System.out.println("Beca completa");
        } else if ((ingresosMensualesFamilia < 1400 && familiaNumerosa) ||
                ingresosMensualesFamilia < 1100 ||
                (ingresosMensualesFamilia < 1300 && zonaVulnerable) ||
                (discapacidad >= 40 && discapacidad <= 60)) {
            System.out.println("Beca parcial");
        } else if ((ingresosMensualesFamilia >= 1400 && ingresosMensualesFamilia <= 1800) ||
                (discapacidad >= 20 && discapacidad < 40)) {
            System.out.println("Beca simple");
        } else {
            System.out.println("Cumples los requisitos generales, pero no te corresponde a ninguna beca");
        }

    }
}
