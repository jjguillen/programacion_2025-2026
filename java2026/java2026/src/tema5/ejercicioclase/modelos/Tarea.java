package tema5.ejercicioclase.modelos;

public interface Tarea {

    void ejecutar();
    PrioridadTarea getPrioridad();
    EstadoTarea getEstado();
    String getDescripcion();
    String getTipo();
    void mostrarDetalle();

}
