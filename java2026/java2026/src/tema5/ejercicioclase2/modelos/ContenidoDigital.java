package tema5.ejercicioclase2.modelos;

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
}
