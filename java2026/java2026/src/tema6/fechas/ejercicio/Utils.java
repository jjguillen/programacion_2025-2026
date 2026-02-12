package tema6.fechas.ejercicio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    //Implementa una función que determine si una fecha cae en fin de semana
    public static boolean esFinDeSemana(LocalDate fecha) {
        return (fecha.getDayOfWeek().getValue() == 7 || fecha.getDayOfWeek().getValue() == 6);
    }

    //Añade un metodo que genere un calendario con todos los días lectivos del curso (de lunes a viernes)
    public static List<LocalDate> generarCalendarioLectivo(LocalDate fechaInicio, LocalDate fechaFin) {
        List<LocalDate> calendario = new ArrayList<>();

        LocalDate primerDia = fechaInicio;
        while(primerDia.isBefore(fechaFin) || primerDia.isEqual(fechaFin)) {
            if(!esFinDeSemana(primerDia)) {
                calendario.add(primerDia);
            }
            primerDia = primerDia.plusDays(1);
        }
        return calendario;

    }


}
