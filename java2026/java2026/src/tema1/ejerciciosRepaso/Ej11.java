package tema1.ejerciciosRepaso;

public class Ej11 {
    public static void main(String[] args) {

        int numero = 19;
        int resultado; //91

        int digito1 = numero / 10;
        int digito2 = numero % 10;

        resultado = (digito2 * 10) + digito1;

        System.out.println("El resultado es: " + resultado);




    }
}
