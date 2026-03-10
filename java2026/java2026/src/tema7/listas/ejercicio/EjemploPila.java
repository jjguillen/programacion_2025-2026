package tema7.listas.ejercicio;

import java.util.ArrayList;

public class EjemploPila {
    static void main() {

        //Pila -> LIFO -> último en entrar primero en salir

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        IO.println(lista);

        //Quitar el último elemento
        IO.println(lista.removeLast());
    }
}
