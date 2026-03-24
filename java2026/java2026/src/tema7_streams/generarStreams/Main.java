package tema7_streams.generarStreams;

import java.util.stream.Stream;

public class Main {
    static void main() {

        Stream<Integer> numeros = Stream.of(10,9,8,7,6,5,4,3,2,1);

        numeros
                .filter(n -> n > 3)
                .sorted()
                .forEach(IO::println);

        Stream<Integer> impares = Stream.iterate(1, n -> n+2);
        impares
                .limit(10)
                .forEach(IO::println);
    }
}
