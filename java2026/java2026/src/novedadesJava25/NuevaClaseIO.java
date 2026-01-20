package novedadesJava25;

public class NuevaClaseIO {
    static void main() {
        IO.println("Hola mundo");
        IO.print("Hola mundo " + " de la programación");
        IO.println();

        IO.println("Escribe algo");
        String leerLinea = IO.readln();
        System.out.println("Has escrito " + leerLinea);
    }
}
