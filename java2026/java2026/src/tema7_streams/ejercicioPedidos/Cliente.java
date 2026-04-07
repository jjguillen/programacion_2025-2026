package tema7_streams.ejercicioPedidos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Cliente {

    private Long id;
    private String nombre;
    private Integer nivel;
}
