package tema7_streams.ejercicioPedidos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Producto {

    private Long id;
    private String nombre;
    private CategoriaProducto categoria;
    private Double precio;

}
