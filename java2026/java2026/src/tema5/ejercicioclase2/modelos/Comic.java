package tema5.ejercicioclase2.modelos;

public class Comic extends Libro {

    private String dibujante;
    private String serie;
    private Integer numero;

    public Comic(String title, String author, Integer year, String dibujante, String serie, Integer numero) {
        super(title, author, year);
        this.dibujante = dibujante;
        this.serie = serie;
        this.numero = numero;
    }

    public Comic(Comic otro) {
        super(otro);
        this.dibujante = otro.dibujante;
        this.serie = otro.serie;
        this.numero = otro.numero;
    }

    public String getDibujante() {
        return dibujante;
    }

    public void setDibujante(String dibujante) {
        this.dibujante = dibujante;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Comic \uD83D\uDE03 {");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year=").append(year);
        sb.append(", dibujante='").append(dibujante).append('\'');
        sb.append(", serie='").append(serie).append('\'');
        sb.append(", numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getTipo() {
        return "Cómic";
    }
}
