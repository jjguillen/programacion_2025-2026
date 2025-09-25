package tema1;

public class EjemploEnumerados {
    public static void main(String[] args) {

        //Es como definir un tipo de cadena, que solo puede tomar esos valores
        enum Notas { SOBRESALIENTE, NOTABLE, APROBADO, SUSPENSO }

        //Declaración de una variable de tipo Notas
        Notas miNota = Notas.SOBRESALIENTE;

        System.out.println(miNota);

        miNota = Notas.NOTABLE;

        System.out.println(miNota);



    }
}
