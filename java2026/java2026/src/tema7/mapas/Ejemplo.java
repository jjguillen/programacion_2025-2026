package tema7.mapas;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo {

    static void main() {

        //Creación del mapa -> HashMap
        Map<String, String> diccionario = new HashMap<>();

        //Insertar pares clave-valor
        diccionario.put("dog", "perro");
        diccionario.put("house", "casa");
        diccionario.put("cat", "gato");
        diccionario.put("blade", "espada");
        diccionario.put("laptop", "portátil");

        //Pintar diccionario
        IO.println(diccionario);

        //Eliminar por clave
        diccionario.remove("dog");
        IO.println(diccionario);

        //Obtener valor por clave
        IO.println(diccionario.get("house"));





    }

}
