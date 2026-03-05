package tema6.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ComparacionFechas {

    static void main() {

        //Comparación fechas, horas y fechas-horas: isAfter, isBefore, isEqual
        LocalDateTime fecha = LocalDateTime.now().plusDays(1);

        IO.println("Mañana es posterior a hoy " + fecha.isAfter(LocalDateTime.now()));
        IO.println("Mañana es anterior a hoy " + fecha.isBefore(LocalDateTime.now()));

        IO.println("Hoy es anterior a dentro de tres días " +
                (LocalDate.now()).isBefore(LocalDate.now().plusDays(3)));

        IO.println("Ahora es igual que ahora? " +
                (LocalDate.now()).equals(LocalDate.now()));

        //Ojo con los nanosegundos al comparar horas
        LocalTime hora1 = LocalTime.of(22,22);
        LocalTime hora2 = LocalTime.of(22,22);
        IO.println("Son iguales? " + hora1.equals(hora2));
        IO.println(hora1 + " - " + hora2);

    }
}
