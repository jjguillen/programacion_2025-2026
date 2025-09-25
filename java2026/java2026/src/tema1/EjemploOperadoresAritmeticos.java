package tema1;

public class EjemploOperadoresAritmeticos {
    public static void main(String[] args) {

        //long numero1 = 145, numero2 = 23;
        double numero1 = 145, numero2 = 23;
        double resultado = 0;

        System.out.println("Suma = " + (numero1 + numero2) );
        System.out.println("Resta = " + (numero1 - numero2) );
        System.out.println("Multiplicación = " + (numero1 * numero2) );
        System.out.println("Division = " + (numero1 / numero2) );
        System.out.println("Resto de la división = " + (numero1 % numero2) );

        resultado = (numero1 * numero1) + (numero2 / numero1) - (numero2 * 22);
        System.out.println("Resultado = " + resultado);


    }
}
