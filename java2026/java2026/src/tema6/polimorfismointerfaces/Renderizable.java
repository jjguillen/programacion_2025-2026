package tema6.polimorfismointerfaces;

public interface Renderizable {
    void render();
    void update();
    void dispose();

    default void init() {
        IO.println("Iniciando renderizado...");
    }
}
