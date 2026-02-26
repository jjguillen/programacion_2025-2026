package tema7.conjuntos.ejercicio;

public class Main {
    static void main() {

        Ranking ranking = new Ranking();
        ranking.registrar(new Jugador(1, "Chokas", "España"));
        ranking.registrar(new Jugador(2, "Ibai", "España"));
        ranking.registrar(new Jugador(3, "YO", "España"));
        ranking.registrar(new Jugador(3, "YO", "España"));

        ranking.pintarJugadores();
        ranking.modificarPuntuacion(1, 100);
        ranking.modificarPuntuacion(2, 200);
        ranking.modificarPuntuacion(3, 200);

        ranking.pintarRanking();



    }
}
