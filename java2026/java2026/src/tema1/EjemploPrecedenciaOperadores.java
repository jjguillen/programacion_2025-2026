package tema1;

public class EjemploPrecedenciaOperadores {
    public static void main(String[] args) {

        double num1=5, num2=9, num3=10;

        System.out.println( (num1 * 5 + num2 * 10) ); //115
        System.out.println( (num1 + 7 / num3 - 4)); //1.7
        System.out.println( (num3 / 2 * num2 % 2)); // 1   --> A la misma precedencia de izquierda a derecha

    }
}
