package tema7_streams;

import java.util.function.Supplier;

public class EjemploSupplier {
    static void main() {

        Supplier<String> supplier = () -> { return new String("Hola Mundo!"); };
        //Supplier<String> supplier3 = () -> "Hola Mundo!";
        String valor = supplier.get();
        System.out.println("Obtención de un valor nuevo: " + valor);


    }
}
