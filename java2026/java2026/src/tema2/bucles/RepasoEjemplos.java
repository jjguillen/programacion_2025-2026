package tema2.bucles;

public class RepasoEjemplos {
    public static void main(String[] args) {

        int dado;
        int contador6; //Cuántas veces sale el 6
        int contadorBucle; //Para hacer 50 tiradas

        //50 veces

        contador6=0;
        contadorBucle=1;
        while(contadorBucle <= 50) {
            dado = (int)(Math.random()*6+1);
            if (dado == 6) {
                contador6++;
            }
            System.out.println(dado);

            contadorBucle++; //Acercarse a que sea falsa la condición
        }

        System.out.println("Ha salido 6 " + contador6 + " veces");

        //LO MISMO CON FOR
        contador6=0;
        for(int i=1; i <= 50; i++) { //Bucle que se ejecuta 50 veces
            dado = (int)(Math.random()*6+1);
            if (dado == 6) {
                contador6++;
            }
            System.out.println(dado);
        }




    }
}
