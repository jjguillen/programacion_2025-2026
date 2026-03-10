package tema7.genericos;

import tema7.listas.Persona;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploArrayList {

    static void main() {

        List<String> palabras = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();

        palabras.add("Hola");
        palabras.add("Mundo");

        numeros.add(10);
        numeros.add(20);

        System.out.println(palabras);
        System.out.println(numeros);

        LinkedList<Persona> lista = new LinkedList<>();
    }


}
