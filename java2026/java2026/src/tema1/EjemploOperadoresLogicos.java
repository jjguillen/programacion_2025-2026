package tema1;

public class EjemploOperadoresLogicos {
    public static void main(String[] args) {

        int edadPepe = 25, edadAna = 16;

        System.out.println((edadPepe < 18) && (edadAna < 18)); //Menores edad
        System.out.println((edadPepe >= 18) && (edadAna >= 18)); //Menores edad

        String login = "Manolo08";
        String password = "987654321";
        boolean resultado;

        //Condiciones
        //1. login == "Manolo08" Y password == "987654321"
        //2. login == "Manolo08" O password == "987654321"
        //3. login != "Manolo08" O password.length() < 8
        //4. ! (login != "Manolo08" O password.length() >= 8)

        resultado = (login == "Manolo08" && password == "987654321");
        System.out.println(resultado);

        resultado = (login == "Manolo08" || password == "987654321");
        System.out.println(resultado);

        // login != "Manolo08" es false --> porque es igual
        // password.length() < 8 es false --> porque password.length() = 9
        // false || false --> false
        resultado = (login != "Manolo08" || password.length() < 8);
        System.out.println(resultado);

        //! (login != "Manolo08" O password.length() >= 8)
        // login != "Manolo08" --> false
        // password.length() >= 8 --> true
        // false || true --> true
        // ! true --> false
        resultado = ! (login != "Manolo08" || password.length() >= 8);
        System.out.println(resultado);

        //"987654321"
        // 123456789 --> longitud = num. caracteres --> 9
        String nombre = "Javier";
        System.out.println(nombre.length());
        System.out.println("Vinicius".length());













    }
}
