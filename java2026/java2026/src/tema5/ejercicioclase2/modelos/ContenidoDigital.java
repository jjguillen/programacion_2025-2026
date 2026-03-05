package tema5.ejercicioclase2.modelos;

import java.util.Objects;
import java.util.UUID;

public abstract class ContenidoDigital extends Libro {

    protected Integer size; //MegaBytes

    public ContenidoDigital(String title, String author, Integer year, Integer size) {
        super(title, author, year);
        this.size = size;
    }

    public ContenidoDigital(ContenidoDigital otro) {
        super(otro);
        this.size = otro.size;
    }

    public Integer getSize() {
        return size;
    }

       public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContenidoDigital{");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year=").append(year);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

    public abstract void reproducir();
}
