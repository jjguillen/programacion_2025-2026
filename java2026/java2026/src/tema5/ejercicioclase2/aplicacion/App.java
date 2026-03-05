package tema5.ejercicioclase2.aplicacion;

import tema5.ejercicioclase2.modelos.*;
import tema5.ejercicioclase2.servicio.Biblioteca;

public class App {
    static void main() {

        Biblioteca biblioteca = new Biblioteca("Biblioteca del Jaroso");

        AudioLibro cd1 = new AudioLibro("El nombre del viento", "Patrick Rothfuss",
                2010, 8, 180, "Manolo Lama");
        Ebook cd2 = new Ebook("La península de las casas vacías", "David Uclés",
                2025, 10, 700, "epub");
        Libro lb1 = new Libro("Java for dummies", "Yo", 2026);
        Comic lb2 = new Comic("Zombie Spiderman", "Quien sea", 2010,
                "No lo sé", "Zombies Marvel", 3);


        //Añadir contenido digital a la biblioteca
        biblioteca.addContenido(cd1);
        biblioteca.addContenido(cd2);
        biblioteca.addContenido(lb1);
        biblioteca.addContenido(lb2);

        for(Libro lb: biblioteca.getContenidos()) {
            IO.println(lb);
            IO.println(lb.getTipo());
            //lb.reproducir();

            //Preguntar de qué clase es el objeto en concreto
            //Mucha gente dice que eso rompe la POO
            if (lb instanceof ContenidoDigital) {
                ((ContenidoDigital) lb).reproducir();
            }
        }

    }
}
