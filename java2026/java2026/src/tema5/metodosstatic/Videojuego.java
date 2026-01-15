package tema5.metodosstatic;

public class Videojuego {
    public enum CategoriaVideojuego {
        ACCION,
        AVENTURA,
        RPG,
        CONDUCCION,
        ESTRATEGIA,
        DEPORTE,
        SIMULACION,
        MMO
    }

    public static Integer totalJuegos = 0;
    public static Double precioAlquiler = 5.0;
    public static Integer totalJuegosPrestados = 0;

    public String codigo;
    public String titulo;
    public String plataforma;
    public CategoriaVideojuego categoria;
    public boolean disponible;
    public Integer vecesAlquilado;

    //Constructor con titulo, plantaforma y categoria, lo demás lo ponéis vosotros
    //Constructor copia, con código nuevo
    //Los constructores incrementan totalJuegos
    //Getters y setters
    //toString
    //equals por codigo
    //Metodo para generar código --> GAME-0000<totalJuegos>
    //Metodo para cambiar el precio del alquiler de todos los juegos
    //Metodo para alquilar --> Si está disponible, lo pone no disponible e incrementa totalJuegosPrestados
    //                         e incrementa vecesAlquilado en 1. true si puede alquilar, false si no
    //Metodo para devolver --> Si no está disponible, se pone disponible y se decrementa totalJuegosPrestados
    //                         true si puede devolver, false si no
    //Metodo para calcular el precio del alquiler de un juego -->
    //    - Si el juego ha sido alquilado más de 20 veces, le sumamos 1€ al precio base de alquiler y devolvemos ese valor
    //    - Si el juego ha sido alquilado más de 100 veces, le sumamos 2€ al precio base del alquiler y devolvemos ese valor











}
