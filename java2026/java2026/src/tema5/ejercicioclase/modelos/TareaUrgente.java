package tema5.ejercicioclase.modelos;

public class TareaUrgente extends TareaBase {

    private Integer plazoHoras;

    public TareaUrgente(String titulo, String descripcion, Integer plazoHoras) {
        super(titulo, descripcion, PrioridadTarea.URGENTE);
        this.plazoHoras = plazoHoras;
    }

    public Integer getPlazoHoras() {
        return plazoHoras;
    }

    public void setPlazoHoras(Integer plazoHoras) {
        this.plazoHoras = plazoHoras;
    }

    @Override
    public String getTipo() {
        return "URGENTE";
    }
}
