package tema5.ejercicioclase.servicios;

import tema5.ejercicioclase.modelos.EstadoTarea;
import tema5.ejercicioclase.modelos.PrioridadTarea;
import tema5.ejercicioclase.modelos.Tarea;
import tema5.ejercicioclase.modelos.TareaBase;

import java.util.ArrayList;

public class GestorTareas {

    private String nombreUsuario;
    private ArrayList<Tarea> tareas;

    public GestorTareas(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.tareas = new ArrayList<>();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }


    //Métodos básicos -------------------------------------------------------
    public void agregarTarea(Tarea nuevaTarea) {
        tareas.add(nuevaTarea);
    }

    public void eliminarTarea(Tarea tarea) {
        tareas.remove(tarea);
    }

    public Tarea buscarTarea(int id) {
        for(Tarea tarea : tareas) {
            // Casting para pasar de tarea (interfaz Tarea) a TareaBase y poder llamar a getId
            if ( ((TareaBase) tarea).getId().equals(id) ) {
                return tarea;
            }
        }
        return null;
    }

    //Métodos de filtrado -------------------------------------------------------------

    /**
     * Devolver una lista con todas las tareas con un estado determinado
     * @param estado de la tarea
     * @return ArrayList<Tarea>
     */
    public ArrayList<Tarea> getTareasPorEstado(EstadoTarea estado) {
        ArrayList<Tarea> lista = new ArrayList<>();
        for(Tarea tarea : tareas) {
            if ( tarea.getEstado().equals(estado) ) {
                //Añadir a la nueva lista si la tarea tiene el estado deseado
                lista.add(tarea);
            }
        }
        return lista;
    }

    /**
     * Devolver una lista con todas las tareas con una prioridad determinada
     * @param prioridad de la tarea
     * @return lista con las tareas con la misma prioridad
     */
    public ArrayList<Tarea> getTareasPorPrioridad(PrioridadTarea prioridad) {
        ArrayList<Tarea> lista = new ArrayList<>();
        for(Tarea tarea : tareas) {
            if ( tarea.getPrioridad().equals(prioridad) ) {
                //Añadir a la nueva lista si la tarea tiene la misma prioridad
                lista.add(tarea);
            }
        }
        return lista;
    }

    /**
     * Devolver una lista con todas las tareas URGENTES (TareaUrgente)
     * @return ArrayList<Tarea>
     */
    public ArrayList<Tarea> getTareasUrgentes() {
        ArrayList<Tarea> lista = new ArrayList<>();
        for(Tarea tarea : tareas) {
            if ( tarea.getTipo().equals("URGENTE") ) {
                //Añadir a la nueva lista si la tarea es URGENTE
                lista.add(tarea);
            }
        }
        return lista;
    }

    /**
     * Devolver una lista con todas las tareas PENDIENTES
     * @return ArrayList<Tarea>
     */
    public ArrayList<Tarea> getTareasPendientes() {
        return getTareasPorEstado(EstadoTarea.PENDIENTE);
    }

    public void listarTareas() {
        IO.println("Tareas del usuario " + nombreUsuario);
        for(Tarea tarea : tareas) {
            IO.println(tarea);
        }
    }

    public void listarTareasPendientes() {
        IO.println("Tareas pendientes del usuario " + nombreUsuario);
        for(Tarea tarea : getTareasPendientes()) {
            IO.println(tarea);
        }
    }




}
