package tema2.procedimientosYFunciones;

import java.util.Scanner;

public class MultiplesAreas {

    public static void pintarMenu() {
        System.out.println("1. Área de un círculo");
        System.out.println("2. Área de un cuadrado");
        System.out.println("3. Área de un rectángulo");
        System.out.println("4. Área de un triángulo");
        System.out.println("5. Salir");
    }

    public static double calcAreaCirculo(double rd) {
        return Math.PI * rd * rd;
    }

    public static double calcAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcAreaRectangulo(double base, double altura) {
        return base * altura;
    }


    public static void main(String[] args) {
        //Menú para decir qué tipo de forma para calcular el área quieres

        Scanner sc = new Scanner(System.in);
        int opcion=-1;
        double radio, lado, base, altura;

        do {
            try {
                pintarMenu();
                System.out.println("Dime una opción (1-5)");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Dime radio: ");
                        radio = sc.nextDouble();
                        System.out.println("El área es " + calcAreaCirculo(radio));
                        break;
                    case 2:
                        System.out.println("Dime lado: ");
                        lado = sc.nextDouble();
                        System.out.println("El área es " + calcAreaCuadrado(lado));
                        break;
                    case 3:
                        System.out.println("Dime base: ");
                        base = sc.nextDouble();
                        System.out.println("Dime altura: ");
                        altura = sc.nextDouble();
                        System.out.println("El área es " + calcAreaRectangulo(base, altura));
                        break;
                    case 4:
                        System.out.println("Dime base: ");
                        base = sc.nextDouble();
                        System.out.println("Dime altura: ");
                        altura = sc.nextDouble();
                        System.out.println("El área es " + Funciones3.areaTriangulo(base, altura));
                        break;
                    case 5:
                        System.out.println("Gracias por usar nuestro programa");
                        break;
                    default:
                        System.out.println("Opción incorrecta");

                }
            } catch (Exception ex) {
                System.out.println(ex.toString());
                opcion = -1;
                sc = new Scanner(System.in);
            }

        } while(opcion != 5);


    }
}
