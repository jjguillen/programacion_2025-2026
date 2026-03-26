package tema7_streams.ejemploCanciones;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tema7_streams.ejemploCanciones.Genero;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cancion {
    private String titulo;
    private Artista artista;
    private int anioLanzamiento;
    private int duracionSegs;
    private double popularidad;
    private Genero genero;
}
