package tema2.condicionales;

public class EjemploSwitch {
    public static void main(String[] args) {

        //Programa que me diga según la nota si estás suspenso
        //Aprobado, Notable o Sobresaliente

        int nota = 11;

        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Aprobado");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        switch (nota) {
            case 1,2,3,4:
                System.out.println("Suspenso"); break;
            case 5,6:
                System.out.println("Aprobado"); break;
            case 7,8:
                System.out.println("Notable"); break;
            case 9,10:
                System.out.println("Sobresaliente"); break;
            default: //Cualquier otro valor
                System.out.println("Nota fuera de rango");
        }


    }
}
