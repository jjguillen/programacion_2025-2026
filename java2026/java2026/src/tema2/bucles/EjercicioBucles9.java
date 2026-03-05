package tema2.bucles;

public class EjercicioBucles9 {
    public static void main(String[] args) {

        //Lanza un dado de 20 caras 50 veces y dime cuántas sale un crítico (20)

        //V.E.: tirada del dado
        //V.S.: número de veces que salio 20

        //Diseño
        //a) Lanzar un dado de 20 caras
        //   Generando un número aleatorio entre 1 y 20
        //   int dado = (int) (Math.random() * 20) + 1;
        //b) Lanzarlo 50 veces
        //   Bucle de 1 a 50
        //   for(int i=1; i<=50; i++) {}
        //c) comparar que el dado sea == 20 eso es un crítico
        //   Necesito un contador=0 que sume uno cada vez que dado==20

        int dado;
        int contadorCritico=0;

        for(int num=1; num <= 50; num++) {
            dado = (int) (Math.random() * 20) + 1;
            //System.out.println(dado);
            if (dado == 20) {
                contadorCritico++;
            }
        }

        System.out.println("Han salido " + contadorCritico + " críticos");






    }
}
