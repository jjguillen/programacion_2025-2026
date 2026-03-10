package tema7.genericos.Cola;

import java.util.ArrayList;
import java.util.List;

public class ColaMensaje<E extends Notificable> {

    private List<E> mensajes = new ArrayList<>();

    public List<E> getMensajes() {
        return mensajes;
    }

    /**
     * Añadimos al final de la cola
     * @param mensaje
     */
    public void insertar(E mensaje) {
        mensajes.addLast(mensaje);
    }

    /**
     * Sacamos del principio de la cola
     * @return
     */
    public E sacar() {
        return mensajes.removeFirst();
    }

    /**
     * Pintamos todos los mensajes
     */
    public void pintar() {
        for(E t : mensajes) {
            t.notificar();
        }
    }
}
