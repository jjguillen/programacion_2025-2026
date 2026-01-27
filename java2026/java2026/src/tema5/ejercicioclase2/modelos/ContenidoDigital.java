package tema5.ejercicioclase2.modelos;

import java.util.Objects;
import java.util.UUID;

public abstract class ContenidoDigital {

    protected String id;
    protected String title;
    protected String author;
    protected Integer year;
    protected Integer size; //MegaBytes

    public ContenidoDigital(String title, String author, Integer year, Integer size) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.year = year;
        this.size = size;
    }

    public ContenidoDigital(ContenidoDigital otro) {
        this.id = otro.id;
        this.title = otro.title;
        this.author = otro.author;
        this.year = otro.year;
        this.size = otro.size;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getSize() {
        return size;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContenidoDigital that = (ContenidoDigital) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    public abstract String getTipo();
    public abstract void reproducir();
}
