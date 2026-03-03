package tema6.repaso.entidades;

public interface Producto {

    String getCodigo();
    String getNombre();
    Double getPrecio();
    Integer getStock();
    void descontarStock(int cantidad);
    String getInfo();

}
