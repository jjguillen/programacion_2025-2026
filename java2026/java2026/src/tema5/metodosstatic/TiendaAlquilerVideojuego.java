package tema5.metodosstatic;

import java.util.ArrayList;

public class TiendaAlquilerVideojuego {

    private String nombre;
    private ArrayList<Videojuego> videojuegos;

    public TiendaAlquilerVideojuego(String nombre) {
        this.nombre = nombre;
        this.videojuegos = new ArrayList<>();
    }

    public void agregarVideojuego(Videojuego v) {
        videojuegos.add(v);
    }

    public void quitarVideojuego(Videojuego v) {
        videojuegos.remove(v);
    }

    public Integer getNumeroVideojuegos() {
        return videojuegos.size();
    }

    public void mostrarVideojuegos() {
        System.out.println(nombre);
        for(Videojuego v: videojuegos) {
            System.out.println(v);
        }
    }

    public boolean alquilarJuego(String titulo, String plataforma) {

        return false;
    }

    public boolean devolverJuego(String titulo, String plataforma) {

        return false;
    }

    public boolean devolverJuego(String codigo) {

        return false;
    }

    public Double calcularGananciasTotales() {

        return 0.0;
    }



}
