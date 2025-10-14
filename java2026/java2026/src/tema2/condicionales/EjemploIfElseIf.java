package tema2.condicionales;

public class EjemploIfElseIf {
    public static void main(String[] args) {

        int edad = 10;

        if (edad < 4) {
            System.out.println("Eres un bebé");
        } else if (edad == 5) {
            System.out.println("Vas a primero de primaria");
        } else if (edad == 6) {
            System.out.println("Vas a segundo de primaria");
        } else if (edad == 7) {
            System.out.println("Vas a tercero de primaria");
        } else if (edad == 8) {
            System.out.println("Vas a cuarto de primaria");
        } else if (edad == 9) {
            System.out.println("Vas a quinto de primaria");
        } else if (edad == 10) {
            System.out.println("Vas a sexto de primaria");
        } else {
            System.out.println("No eres un estudiante de primaria");
        }

        //Determinar si estás en infantil o guardía, en primaria o en otra cosa
        if (edad < 5) {
            System.out.println("Estás en infantil o guar1dería");
        } else if (edad < 11) { //Edad esté entre 5 y 10
            System.out.println("Estás en primaria");
        } else { //Edad mayor de 10, 11 o más
            System.out.println("Estás en otra cosa");
        }



    }
}
