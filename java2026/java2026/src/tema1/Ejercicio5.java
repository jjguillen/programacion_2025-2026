package tema1;

public class Ejercicio5 {
    public static void main(String[] args) {

        //No funciona true no se puede comparar con 97
        //boolean condicion1 = 97 == 'a' == 97;

        //Funciona pues compara true == true -> true
        boolean condicion2 = 97 == 'a' == true;

        System.out.println(condicion2);
    }
}
