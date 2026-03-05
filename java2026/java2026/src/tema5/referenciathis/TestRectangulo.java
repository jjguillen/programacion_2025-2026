package tema5.referenciathis;

public class TestRectangulo {
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(20.0, 10.0);
        Rectangulo r2 = new Rectangulo(10.0, 20.0);

        //Podemos ir encadenando llamadas al mismo objeto
        //porque devuelven la referencia al mismo
        r1.incrementarAlto() //r1
                .incrementarAncho() //r1
                .incrementarAncho();   //r1

        System.out.println(r1);
        System.out.println(r2);

        Rectangulo r3 = r1; //Esto no copia hace que r1 y r3 apunten al mismo objeto
        r3.incrementarAlto();
        System.out.println("R1 " + r1); //r3 y r1 son el mismo objeto

        Rectangulo r4 = r1.clone(); //r1 y r4 son objetos diferentes

        System.out.println("R4 " + r4);
        r4.incrementarAlto();
        System.out.println("R4 " + r4);
        System.out.println("R1 " + r1);


    }
}
