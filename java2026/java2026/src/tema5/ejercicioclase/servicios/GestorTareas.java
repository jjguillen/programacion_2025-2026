package tema5.ejercicioclase.servicios;

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



}
