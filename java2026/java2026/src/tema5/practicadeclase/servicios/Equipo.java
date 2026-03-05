package tema5.practicadeclase.servicios;

import tema5.practicadeclase.entidades.Jugador;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private String pais;
    private Integer totalPuntos;
    private List<Jugador> jugadores;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.totalPuntos = 0;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(Integer totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * Imprime datos básicos del equipo
     */
    public void imprimirDatosEquipo() {
        IO.println( "Equipo: " + nombre + " (" + pais + ")");
        //IO.println( "Total de puntos: " + calcularTotalPuntos());
        IO.println( "Total de puntos: " + this.totalPuntos); //*
    }

    /**
     * Añade un nuevo jugador al equipo
     * @param jugador
     */
    public void nuevoJugador(Jugador jugador) {
        jugadores.add(jugador);
        this.totalPuntos += jugador.getPuntos(); //*
    }

    /**
     * Suma los puntos de todos los jugadores del equipo
     * @return La suma de los puntos de todos los jugadores
     */
    public Integer calcularTotalPuntos() {
        Integer total = 0;
        for(Jugador jugador: jugadores) {
            total += jugador.getPuntos();
        }
        this.totalPuntos = total; //*
        return total;
    }

    /**
     * Imprime para cada jugador del equipo su alias y sus puntos
     */
    public void listarJugadores() {
        for(Jugador jugador: jugadores) {
            IO.println(jugador.getAlias() + " (" + jugador.getPuntos() + ")");
        }
    }

    /**
     * Busca un jugador por su id
     * @param id
     * @return el Jugador con ese id o null si no se encuentra
     */
    public Jugador buscarJugadorPorId(Integer id) {
        for(Jugador jugador: jugadores) {
            if (jugador.getId().equals(id)) {
                return jugador;
            }
        }

        IO.println("Jugador no encontrado");
        return null;
    }



}
