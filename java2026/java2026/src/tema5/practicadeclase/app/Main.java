package tema5.practicadeclase.app;

import tema5.practicadeclase.entidades.Apoyo;
import tema5.practicadeclase.entidades.Asesino;
import tema5.practicadeclase.entidades.Jugador;
import tema5.practicadeclase.entidades.Tanque;
import tema5.practicadeclase.servicios.Equipo;

public class Main {

    /**
     * Método que pinta las opciones disponibles
     */
    private static void opciones() {
        IO.println("1. Imprimir datos del equipo");
        IO.println("2. Añadir un jugador");
        IO.println("3. Añadir puntos a un jugador tras una partida (id, puntos)");
        IO.println("4. Calcular el total de puntos del equipo");
        IO.println("5. Listar todos los jugadores");
        IO.println("6. Buscar un jugador");
        IO.println("7. Salir");
    }

    /**
     * Método que pide los datos de un nuevo jugador al usuario, incluyendo
     * el tipo de jugador
     * @return Jugador (Tanque, Apoyo o Asesino) creado
     * @throws NumberFormatException
     */
    private static Jugador datosNuevoJugador() throws NumberFormatException{
        int tipoJugador;
        IO.println("Introduce tipo de jugador (1.Tanque - 2.Apoyo - 3.Asesino)");
        tipoJugador = Integer.parseInt(IO.readln());
        switch (tipoJugador) {
            case 1 -> {
                IO.println("Introduce nombre del tanque");
                String nombre = IO.readln();
                IO.println("Introduce puntos del tanque");
                int puntos = Integer.parseInt(IO.readln());
                IO.println("Introduce daño recibido por tanque:");
                Double danio = Double.parseDouble(IO.readln());
                IO.println("Introduce defensa promedio:");
                Double defensa = Double.parseDouble(IO.readln());
                return new Tanque(nombre, puntos, danio, defensa);
            }
            case 2 -> {
                IO.println("Introduce nombre del apoyo");
                String nombre = IO.readln();
                IO.println("Introduce puntos del apoyo");
                int puntos = Integer.parseInt(IO.readln());
                IO.println("Introduce curaciones por partida:");
                Integer curaciones = Integer.parseInt(IO.readln());
                IO.println("Introduce eficiencia asistencia:");
                Float eficiencia = Float.parseFloat(IO.readln());
                return new Apoyo(nombre, puntos, curaciones, eficiencia);
            }
            case 3 -> {
                IO.println("Introduce nombre del asesino");
                String nombre = IO.readln();
                IO.println("Introduce puntos del asesino");
                int puntos = Integer.parseInt(IO.readln());
                IO.println("Introduce precisión:");
                Float precision = Float.parseFloat(IO.readln());
                IO.println("Introduce bajas por partida:");
                Integer bajas = Integer.parseInt(IO.readln());
                return new Asesino(nombre, puntos, precision, bajas);
            }
            default -> IO.println("Tipo de jugador incorrecto");
        }
        IO.println("Error introduciendo datos del jugador");
        return null;
    }

    //------------------------------------------------------------------------
    static void main() {
        int opcion=-1;
        int puntos=0;
        int idJugador=0;

        Equipo mov = new Equipo("Movistar KOI", "España");

        do {
            try {
                opciones();
                IO.print("Introduce una opción: ");
                opcion = Integer.parseInt(IO.readln());

                switch (opcion) {
                    case 1 -> mov.imprimirDatosEquipo();
                    case 2 -> {
                        try {
                            mov.nuevoJugador(datosNuevoJugador());
                        } catch (Exception ex) {
                            IO.println("Error introduciendo datos del jugador");
                        }
                    }
                    case 3 -> {
                        IO.print("Introduce el id del jugador: ");
                        idJugador = Integer.parseInt(IO.readln());
                        Jugador jugador = mov.buscarJugadorPorId(idJugador);
                        if (jugador != null) {
                            IO.println("Introduce puntos del jugador: ");
                            puntos = Integer.parseInt(IO.readln());
                            jugador.addPuntos(puntos);
                        }
                    }
                    case 4 -> IO.println("Total de puntos del equipo: " + mov.calcularTotalPuntos());
                    case 5 -> mov.listarJugadores();
                    case 6 -> {
                        IO.println("Introduce el id del jugador a buscar: ");
                        idJugador = Integer.parseInt(IO.readln());
                        Jugador jugador = mov.buscarJugadorPorId(idJugador);
                        if (jugador != null) {
                            IO.println(jugador.getAlias() + " tiene " + jugador.getPuntos() + " puntos");
                        }
                    }
                    case 7 -> IO.println("Hasta luego");
                    default -> IO.println("Opción incorrecta (1-7)");
                }
            } catch (Exception ex) {
                IO.println("Error introduciendo datos");
            }
        } while (opcion != 7);


    }
}
