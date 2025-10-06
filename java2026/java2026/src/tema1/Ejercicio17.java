package tema1;

public class Ejercicio17 {
    public static void main(String[] args) {

        //int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>))
        // + <numero_mínimo>;

        //a. 1 y 49
        int n = (int) (Math.random() * 49) + 1;
        System.out.println(n);

        //b. Un número par
        n = (int) (Math.random() * 200) + 1;
        System.out.println(n * 2);

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



    }
}
