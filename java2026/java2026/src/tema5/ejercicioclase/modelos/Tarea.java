package tema5.ejercicioclase.modelos;

public interface Tarea {

    void ejecutar();
    PrioridadTarea obtenerPrioridad();
    EstadoTarea obtenerEstado();
    String obtenerDescripcion();
    String obtenerTipo();
    void mostrarDetalle();

}
