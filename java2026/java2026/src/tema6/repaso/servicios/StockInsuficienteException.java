package tema6.repaso.servicios;

public class StockInsuficienteException extends Exception {

    public StockInsuficienteException(String codigo) {
        super("Stock insuficiente para el producto " + codigo);
    }
}
