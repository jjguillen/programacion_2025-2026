package tema5.metodosstatic;

import java.sql.SQLOutput;

public class TestTiendaAlquilerVideojuegos {
    public static void main(String[] args) {

        TiendaAlquilerVideojuego game = new TiendaAlquilerVideojuego("GameStop");
        game.agregarVideojuego(new Videojuego("Mario Bros", "Nintendo 64", Videojuego.CategoriaVideojuego.AVENTURA));
        game.agregarVideojuego(new Videojuego("Street Fighter II", "NES", Videojuego.CategoriaVideojuego.ACCION));
        game.agregarVideojuego(new Videojuego("Super Mario World", "SNES", Videojuego.CategoriaVideojuego.AVENTURA));
        game.agregarVideojuego(new Videojuego("Final Fantasy VII", "NES", Videojuego.CategoriaVideojuego.AVENTURA));

        for(int i=0; i < 250; i++) {
            game.alquilarJuego("Street Fighter II", "NES");
            game.devolverJuego("Street Fighter II", "NES");
        }

        for(int i=0; i < 250; i++) {
            game.alquilarJuego("Final Fantasy VII", "NES");
            game.devolverJuego("GAME-000004");
        }

        System.out.println("He ganado: " + game.calcularGananciasTotales());

    }
}
