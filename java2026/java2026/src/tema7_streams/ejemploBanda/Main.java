package tema7_streams.ejemploBanda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {

        List<Musico> banda = new ArrayList<>();
        banda.add(new Musico("Pedro", 21,
                LocalDate.of(2010,9,1),Instrumento.CLARINETE));
        banda.add(new Musico("Laura", 15,
                LocalDate.of(2010,9,1),Instrumento.TUBA));
        banda.add(new Musico("Andrés", 18,
                LocalDate.of(2010,9,1),Instrumento.TAMBOR));
        banda.add(new Musico("Sonia", 25,
                LocalDate.of(2010,9,1),Instrumento.TAMBOR));
        banda.add(new Musico("Juan", 32,
                LocalDate.of(2010,9,1),Instrumento.CLARINETE));
        banda.add(new Musico("Javier", 15,
                LocalDate.of(2010,9,1),Instrumento.FLAUTA));
        banda.add(new Musico("Ana", 21,
                LocalDate.of(2010,9,1),Instrumento.TROMBON));
        banda.add(new Musico("Luisa", 31,
                LocalDate.of(2010,9,1),Instrumento.FLAUTA));


    }

}
