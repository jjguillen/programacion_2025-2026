package tema5.ejercicioclase.modelos;

public enum PrioridadTarea {
    BAJA(1),
    MEDIA(2),
    ALTA(3),
    URGENTE(4);

    private int prioridad;

    PrioridadTarea(int valor) {
        this.prioridad = valor;
    }

    public int getValor() {
        return prioridad;
    }

}
