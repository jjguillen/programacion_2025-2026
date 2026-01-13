package tema4.ejercicios;

public class TestSteamJuego {
    public static void main(String[] args) {


        SteamJuego cs2 = new SteamJuego("Counter Strike 2", "Mata mata",
                1200000.0, 900, 0.0, 4);

        SteamJuego pubg = new SteamJuego("PUBG: Battlegrounds", "Estopa",
                500000.0, 700, 0.0, 5);

        SteamJuego rust = new SteamJuego("Rust", "Otro juego",
                12000.0, 500, 35.0, 2);

        System.out.println(cs2);
        System.out.println(pubg);
        System.out.println(rust);

        cs2.jugadoresDia(1300000);
        cs2.jugadoresDia(1200000);

        System.out.println(cs2);


    }
}
