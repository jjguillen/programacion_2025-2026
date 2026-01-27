package tema5.ejercicioclase2.aplicacion;

import tema5.ejercicioclase2.modelos.AudioLibro;
import tema5.ejercicioclase2.modelos.Ebook;

public class App {
    static void main() {

        AudioLibro cd1 = new AudioLibro("El nombre del viento", "Patrick Rothfuss",
                2010, 8, 180, "Manolo Lama");
        Ebook cd2 = new Ebook("La península de las casas vacías", "David Uclés",
                2025, 10, 700, "epub");

        IO.println(cd1);
        IO.println(cd1.getTipo());
        cd1.reproducir();

        IO.println(cd2);
        IO.println(cd2.getTipo());
        cd2.reproducir();


    }
}
