package tema7.mapas;

import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {
    static void main() {

        //AGENDA CONTACTOS
        Map<String, Contacto> agenda = new TreeMap<>();
        agenda.put("felisico", new Contacto("Félix","fe@gmail.com", "Sucasa", "65689974"));
        agenda.put("sonia", new Contacto("Sonia García", "sg@gmail.com","Micasa", "989652147"));
        agenda.put("pelo exótico", new Contacto("Jesús", "yesus@gmail.com", "Casadetodos", "545852147"));
        agenda.put("ana profe", new Contacto("Ana García", "abelm@gmail.com", "Vera", "648741268"));

        //Pintar directamente
        IO.println(agenda);

        //Pintar agenda por clave
        IO.println("--- Agenda ---");
        for(String clave : agenda.keySet()) {
            IO.println(clave + " -> " + agenda.get(clave).getTelefono() + ", " + agenda.get(clave).getEmail());
        }

        IO.println("Dime un nombre:");
        String nombre = IO.readln();
        if (agenda.containsKey(nombre)) {
            IO.println(agenda.get(nombre));
        } else {
            IO.println("No existe " + nombre + " en la agenda");
        }

        //Mostrar todos los contactos
        IO.println("--- Contactos ---");
        for(Contacto c : agenda.values()) {
            IO.println(c);
        }

        //Mostrar los contactos como Entry<String, Contacto>
        IO.println("--- Entries ---");
        for(Map.Entry<String, Contacto> elem : agenda.entrySet()) {
            IO.println(elem.getKey() + " -> " + elem.getValue().getTelefono());
        }

    }
}
