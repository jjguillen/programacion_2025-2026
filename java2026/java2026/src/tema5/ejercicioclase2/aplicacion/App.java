package tema5.ejercicioclase2.aplicacion;

import tema5.ejercicioclase2.modelos.AudioLibro;
import tema5.ejercicioclase2.modelos.ContenidoDigital;
import tema5.ejercicioclase2.modelos.Ebook;
import tema5.ejercicioclase2.servicio.Biblioteca;

public class App {
    static void main() {

        Biblioteca biblioteca = new Biblioteca("Biblioteca del Jaroso");

        AudioLibro cd1 = new AudioLibro("El nombre del viento", "Patrick Rothfuss",
                2010, 8, 180, "Manolo Lama");
        Ebook cd2 = new Ebook("La península de las casas vacías", "David Uclés",
                2025, 10, 700, "epub");


        //Añadir contenido digital a la biblioteca
        biblioteca.addContenido(cd1);
        biblioteca.addContenido(cd2);

        for(ContenidoDigital cd: biblioteca.getContenidos()) {
            IO.println(cd);
            IO.println(cd.getTipo());
            cd.reproducir();
        }

    }
}
