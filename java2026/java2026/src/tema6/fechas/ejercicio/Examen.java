package tema6.fechas.ejercicio;

import java.time.Duration;
import java.time.LocalDateTime;

public class Examen {
    private String nombre;
    private LocalDateTime fechaHora;

    public Examen(String nombre, LocalDateTime fechaHora) {
        this.nombre = nombre;
        this.fechaHora = fechaHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Examen{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", fechaHora=").append(fechaHora);
        sb.append('}');
        return sb.toString();
    }

    /**
     * MÉTODOS DE LA CLASE -----------------------------------------------
     */

    /**
     * Devuelve cuánto tiempo falta para el examen o ha pasado desde el examen.
     * @return Duration (positivo si ha pasado, negativo si falta)
     */
    public Duration tiempoRelativo() {
        return Duration.between(fechaHora, LocalDateTime.now());
    }

    /**
     * Indica si el examen ya ha pasado.
     */
    public boolean haPasado() {
        return LocalDateTime.now().isAfter(fechaHora);
    }

    /**
     * Devuelve el tiempo que falta para el examen (si no ha pasado).
     * Si ya ha pasado, devuelve Duration.ZERO.
     */
    public Duration tiempoFalta() {
        if (haPasado())
            return Duration.ZERO;

        return Duration.between(LocalDateTime.now(), fechaHora);
    }
}
