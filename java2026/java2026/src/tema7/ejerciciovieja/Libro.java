package tema7.ejerciciovieja;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Objects;

@Getter
@Setter
public class Libro {

    private static Long contador = 0L;

    protected Long id;
    protected String isbn;
    protected String titulo;
    protected String autor;
    protected Integer anioPublicacion;
    protected String code;

    public Libro(String isbn, String titulo, String autor, Integer anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.id = contador++;
        this.code = DigestUtils.shaHex(titulo + autor);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Libro{");
        sb.append("id=").append(id);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", anioPublicacion=").append(anioPublicacion);
        sb.append(", code='").append(code).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }
}
