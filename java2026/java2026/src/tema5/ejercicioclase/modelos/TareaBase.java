package tema5.ejercicioclase.modelos;

import java.time.LocalDate;

/**
 * Clase abstracta (no se pueden crear objetos de esta clase)
 * Va a ser el padre de una herencia --> TareaUrgente y TareaProgramada serán sus hijas
 * Implementa interfaz tarea
 */
public abstract class TareaBase implements Tarea, Comparable<TareaBase> {

    //Contador de tareas, común a todas las instancias
    private static Integer contadorId = 1;

    protected Integer id;
    protected String titulo;
    protected String descripcion;
    protected PrioridadTarea prioridad;
    protected EstadoTarea estado;
    protected LocalDate fechaCreacion;
    protected LocalDate fechaCompletada;

    public TareaBase(String titulo, String descripcion, PrioridadTarea prioridad) {
        this.id = TareaBase.contadorId++;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = EstadoTarea.PENDIENTE;
        this.fechaCreacion = LocalDate.now(); //Fecha en el momento de la ejecución
        this.fechaCompletada = null;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public PrioridadTarea getPrioridad() {
        return prioridad;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaCompletada() {
        return fechaCompletada;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(PrioridadTarea prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TareaBase{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", prioridad=").append(prioridad);
        sb.append(", estado=").append(estado);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaCompletada=").append(fechaCompletada);
        sb.append('}');
        return sb.toString();
    }

    //------- MÉTODOS ----------------------------------------------------------
    /**
     * Cambia el estado de la tarea a COMPLETADA
     * Y pone la fecha del momento en fechaCompletada
     */
    public void ejecutar() {
        this.estado = EstadoTarea.COMPLETADA;
        this.fechaCompletada = LocalDate.now();
    }

    /**
     * Modifica el estado de la tarea
     * @param estado nuevo de la tarea
     */
    public void cambiarEstado(EstadoTarea estado) {
        this.estado = estado;
    }

    @Override
    public abstract String getTipo();

    @Override
    public void mostrarDetalle() {
        //Coge el objeto y lo convierte automáticamente a String
        //llamando a toString, luego pinta ese String
        IO.println(this);
    }

    @Override
    public int compareTo(TareaBase o) {
        return this.prioridad.getValor() - o.prioridad.getValor();
    }
}
