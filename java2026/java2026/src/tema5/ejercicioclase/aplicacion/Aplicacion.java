package tema5.ejercicioclase.aplicacion;

import tema5.ejercicioclase.modelos.*;
import tema5.ejercicioclase.servicios.GestorTareas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Aplicacion {
    static void main() {

        TareaUrgente tu1 = new TareaUrgente("Programar Java este finde",
                "Ponerme a hacer ejercicios del tema4 y 5 como loco",
                48);

        tu1.ejecutar();
        IO.println(tu1.getTipo());
        tu1.mostrarDetalle();
        IO.println(tu1.estaVencida());

        TareaProgramada tp1 = new TareaProgramada("Examen Ana",
                "Examen difícil de SSII", PrioridadTarea.ALTA,
                LocalDate.of(2026, 1, 23),
                LocalTime.of(18, 0));

        tp1.mostrarDetalle();
        IO.println(tp1.obtenerDiasSemana());

        TareaProgramada tp2 = new TareaProgramada("Estudiar más",
                "La herencia no me sale", PrioridadTarea.ALTA,
                LocalDate.of(2026, 1, 27),
                LocalTime.of(8, 0));

        GestorTareas gt = new GestorTareas("Manolo Días");
        gt.agregarTarea(tu1);
        gt.agregarTarea(tp1);
        gt.agregarTarea(tp2);

        gt.listarTareas();

        IO.println("Tareas completadas: ");
        IO.println(gt.getTareasPorEstado(EstadoTarea.COMPLETADA));

        gt.contarTareasPorEstado();
        IO.println("Porcentaje completadas: " + gt.calcularPorcentajeCompletadas() + " %");

        IO.println("Tareas ordenadas por prioridad: ");
        for(Tarea t: gt.ordenarPorPrioridad()) {
            IO.println(t);
        }
    }
}
