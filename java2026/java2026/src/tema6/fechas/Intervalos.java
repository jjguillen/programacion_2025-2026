package tema6.fechas;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Intervalos {
    static void main() {

        Instant instante = Instant.ofEpochSecond(1000000000l);
        IO.println(instante);

        Instant ahora = Instant.now();
        IO.println(ahora);

        //Calcula el tiempo transcurrido al ejecutar un código
        Instant a1 = Instant.now();

        ArrayList<Long> numeros = new ArrayList<>();
        for(long i=0; i < 100000000L; i++) {
            numeros.add(i);
        }

        Instant a2 = Instant.now();

        //Para conocer el tiempo transcurrido entre horas hay dos formas:

        //1. Restando milisengundos
        long tiempoTranscurrido = a2.toEpochMilli() - a1.toEpochMilli();
        IO.println(tiempoTranscurrido);

        //2. Usando la clase Duration
        Duration duracion = Duration.between(a1, a2);
        IO.println(duracion);


    }
}
