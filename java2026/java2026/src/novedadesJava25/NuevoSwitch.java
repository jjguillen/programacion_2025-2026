package novedadesJava25;

public class NuevoSwitch {
    void main() {

        IO.println("Escribe un número");
        int numero = Integer.parseInt(IO.readln());
        switch (numero) {
            case 1,2,3,4,5,6,7,8,9 -> IO.println("Menor que 10 -> " + numero);
            case 10 -> IO.println("Igual a 10 -> " + numero);
            default -> IO.println("Mayor que 10 -> " + numero);
        }


    }
}
