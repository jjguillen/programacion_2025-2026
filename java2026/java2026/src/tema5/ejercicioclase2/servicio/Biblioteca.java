package tema5.ejercicioclase2.servicio;

import tema5.ejercicioclase2.modelos.ContenidoDigital;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<ContenidoDigital> contenidos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.contenidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<ContenidoDigital> getContenidos() {
        return contenidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addContenido(ContenidoDigital cd) {
        this.contenidos.add(cd);
    }

    public void removeContenido(ContenidoDigital cd) {
        this.contenidos.remove(cd);
    }



}
