package tema7.comparable;

import java.util.*;

public class App {
    static void main() {

        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Personaje("Aragorn","Guerrero",5,100));
        personajes.add(new Personaje("Gandalf","Mago",10,80));
        personajes.add(new Personaje("Legolas","Arquero",7,90));
        personajes.add(new Personaje("Frodo","Pícaro",1,100));

        //Ordenar el ArrayList por lo que indique Comparable en Personaje -> por nombre
        Collections.sort(personajes);

        for(Personaje pj: personajes) {
            IO.println(pj);
        }

        IO.println("----------------------------------");
        //En los Set ojo con Comparable, si se repite el elemento de ordenación no lo añade
        Set<Personaje> personajesOrdenados = new TreeSet<>();
        personajesOrdenados.add(new Personaje("Aragorn","Guerrero",5,100));
        personajesOrdenados.add(new Personaje("Gandalf","Mago",10,80));
        personajesOrdenados.add(new Personaje("Legolas","Arquero",7,90));
        personajesOrdenados.add(new Personaje("Frodo","Pícaro",1,100));
        personajesOrdenados.add(new Personaje("Pipin","Pícaro",1,90));
        personajesOrdenados.add(new Personaje("Pipin","Bárabro",5,190));
        for(Personaje pj: personajesOrdenados) {
            IO.println(pj);
        }
    }
}
