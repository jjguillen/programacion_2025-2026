package tema7_streams.partidasEfootball;

import java.time.LocalDateTime;

public class Partida {
    private int id;
    private String jugador;
    private String rival;
    private String modoJuego;      // "PvP", "IA", "Evento", "Liga"
    private String equipoLocal;
    private int golesLocal;
    private int golesVisitante;
    private String duracion;       // "12min", "20min", "30min"
    private LocalDateTime fecha;
    private int estrellasGanadas;

    // Constructor
    public Partida(int id, String jugador, String rival, String modoJuego, String equipoLocal, int golesLocal, int golesVisitante, String duracion, LocalDateTime fecha, int estrellasGanadas) {
        this.id = id;
        this.jugador = jugador;
        this.rival = rival;
        this.modoJuego = modoJuego;
        this.equipoLocal = equipoLocal;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.duracion = duracion;
        this.fecha = fecha;
        this.estrellasGanadas = estrellasGanadas;
    }

    // Getters
    public int getId() { return id; }
    public String getJugador() { return jugador; }
    public String getRival() { return rival; }
    public String getModoJuego() { return modoJuego; }
    public String getEquipoLocal() { return equipoLocal; }
    public int getGolesLocal() { return golesLocal; }
    public int getGolesVisitante() { return golesVisitante; }
    public String getDuracion() { return duracion; }
    public LocalDateTime getFecha() { return fecha; }
    public int getEstrellasGanadas() { return estrellasGanadas; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setJugador(String jugador) { this.jugador = jugador; }
    public void setRival(String rival) { this.rival = rival; }
    public void setModoJuego(String modoJuego) { this.modoJuego = modoJuego; }
    public void setEquipoLocal(String equipoLocal) { this.equipoLocal = equipoLocal; }
    public void setGolesLocal(int golesLocal) { this.golesLocal = golesLocal; }
    public void setGolesVisitante(int golesVisitante) { this.golesVisitante = golesVisitante; }
    public void setDuracion(String duracion) { this.duracion = duracion; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
    public void setEstrellasGanadas(int estrellasGanadas) { this.estrellasGanadas = estrellasGanadas; }

    @Override
    public String toString() {
        return "Partida{" +
                "id=" + id +
                ", jugador='" + jugador + '\'' +
                ", rival='" + rival + '\'' +
                ", modoJuego='" + modoJuego + '\'' +
                ", equipoLocal='" + equipoLocal + '\'' +
                ", golesLocal=" + golesLocal +
                ", golesVisitante=" + golesVisitante +
                ", duracion='" + duracion + '\'' +
                ", fecha=" + fecha +
                ", estrellasGanadas=" + estrellasGanadas +
                '}';
    }
}
