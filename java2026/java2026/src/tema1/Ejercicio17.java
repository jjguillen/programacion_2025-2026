package tema1;

public class Ejercicio17 {
    public static void main(String[] args) {

        int numero=2, cuad=numero * numero;
        System.out.println("Cuad: " + cuad);

        //int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>))
        // + <numero_mínimo>;

        //a. 1 y 49
        int n = (int) (Math.random() * 49) + 1;
        System.out.println(n);

        //b. Un número par
        n = (int) (Math.random() * 200) + 1;
        System.out.println(n * 2);

        //c. Un número real entre 1 y 10
        double numReal = (Math.random() * 10) + 1;
        System.out.println("Número real (1-10)= " + numReal);

        //f. 5,7,33,77,125
        n = (int) (Math.random() * 5) + 1;
        System.out.println(n);
        if (n==1)
            System.out.println(5);
        if (n==2)
            System.out.println(7);
        if (n==3)
            System.out.println(33);
        if (n==4)
            System.out.println(77);
        if (n==5)
            System.out.println(125);

        //g. Meses del año --> 12
        n = (int) (Math.random() * 12) + 1;
        System.out.println(n);
        if (n == 1) {
            System.out.println("Enero");
        }
        if (n == 2) {
            System.out.println("Febrero");
        }
        if (n == 3) {
            System.out.println("Marzo");
        }
        if (n == 4) {
            System.out.println("Abril");
        }
        if (n == 5) {
            System.out.println("Mayo");
        }
        if (n == 6) {
            System.out.println("Junio");
        }
        if (n == 7) {
            System.out.println("Julio");
        }
        if (n == 8) {
            System.out.println("Agosto");
        }
        if (n == 9) {
            System.out.println("Septiembre");
        }
        if (n == 10) {
            System.out.println("Octubre");
        }
        if (n == 11) {
            System.out.println("Noviembre");
        }
        if (n == 12) {
            System.out.println("Diciembre");
        }



    }
}
