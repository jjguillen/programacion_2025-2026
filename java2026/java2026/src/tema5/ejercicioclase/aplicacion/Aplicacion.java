package tema5.ejercicioclase.aplicacion;

import tema5.ejercicioclase.modelos.PrioridadTarea;
import tema5.ejercicioclase.modelos.TareaProgramada;
import tema5.ejercicioclase.modelos.TareaUrgente;

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



    }
}
