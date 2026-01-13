package tema5.ejercicios.ejercicioclase;

import java.util.ArrayList;
import java.util.List;

public class ListaSpotify {

    private String nombre;
    private ArrayList<Cancion> canciones;

    //Constructor parametrizado
    //Constructor copia
    //Getters y setters
    //ToString
    //Añadir canción
    //Eliminar canción

    public ListaSpotify(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public ListaSpotify(ListaSpotify otraLista) {
        this.nombre = otraLista.nombre;
        this.canciones = otraLista.canciones;
        //this.canciones = new ArrayList<>(otraLista.canciones);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ListaSpotify{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", canciones=").append('\n');
        for(Cancion c : canciones)
            sb.append(c).append('\n');
        sb.append('}');
        return sb.toString();
    }

    public void addCancion(Cancion c){
        canciones.add(c);
    }

    public void removeCancion(Cancion c){
        canciones.remove(c);
    }
}
