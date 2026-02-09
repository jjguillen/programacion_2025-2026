package tema5.practicadeclase.entidades;

import java.util.Objects;

public abstract class Jugador {
    private static Integer inc = 1000;

    protected Integer id;
    protected String alias;
    protected Integer puntos;

    public Jugador(String alias, Integer puntos) {
        this.id = inc++;
        this.alias = alias;
        this.puntos = puntos;
    }

    public Integer getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(id, jugador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("id=").append(id);
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Incrementa los puntos del jugador
     * @param puntos
     */
    public void addPuntos(Integer puntos) {
        this.puntos += puntos;
    }

    public abstract void imprimirRol();

}
