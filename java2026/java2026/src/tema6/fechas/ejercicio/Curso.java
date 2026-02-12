package tema6.fechas.ejercicio;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Curso {

    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Curso(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Curso{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append('}');
        return sb.toString();
    }

    /**
     * MÉTODOS DE FECHAS -----------------------------------
     */

    /**
     * Calcular la duración del curso en días, meses y años usando Period
     * @return
     */
    public Period duracion() {
        return Period.between(fechaInicio, fechaFin);
    }

    /**
     * Indicar si el curso está activo o no.
     * Es decir, si la fecha de hoy es posterior al inicio del curso y anterior al final
     * @return
     */
    public boolean estaActivo() {
        LocalDate hoy = LocalDate.now();
        return (hoy.isEqual(fechaInicio) || hoy.isAfter(fechaInicio)) &&
               (hoy.isEqual(fechaFin) || hoy.isBefore(fechaFin));
    }

    /**
     * Calcular cuántos días faltan para que comience el curso (si aún no ha empezado)
     * o cuántos días han pasado desde que comenzó.
     * @return
     */
    public long diasDesdeInicio() {
        return ChronoUnit.DAYS.between(fechaInicio, LocalDate.now());
    }

    /**
     * Para obtener el total de días absoluto entre inicio y fin,
     * ChronoUnit es más preciso que Period.
     * @return
     */
    public long totalDias() {
        return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }









}
