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

    public void removeContenidoById(String id) {
        for(ContenidoDigital cd : contenidos) {
            if (cd.getId().equals(id)) {
                contenidos.remove(cd);
            }
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Biblioteca{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", contenidos=").append('\n');
        for(ContenidoDigital cd : contenidos)
            sb.append(cd).append('\n');
        sb.append('}');
        return sb.toString();
    }


}
