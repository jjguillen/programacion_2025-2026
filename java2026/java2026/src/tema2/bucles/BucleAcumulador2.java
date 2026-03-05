package tema2.bucles;

public class BucleAcumulador2 {
    public static void main(String[] args) {

        //Número elevado a otro número, sin usar Math.pow

        //V.E: base, exponente
        //V.S: resultado

        int base = 10, exponente = 6; //2 elevado a 3
        int resultado = 1; //El acumulador se inicia a 1 porque se multiplica

        //Bucle que se repite tantas veces como indica el exponente
        //Se multiplica el número por sí mismo todas esas veces
        //Se guarda el resultado en un acumulador

        for(int i=1; i <= exponente; i++) {
            resultado = resultado * base;
        }

        System.out.println("El resultado es: " + resultado);
        System.out.println("El resultado es: " + Math.pow(base, exponente));



    }
}
