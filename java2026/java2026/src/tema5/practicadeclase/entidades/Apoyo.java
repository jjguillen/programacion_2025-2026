package tema5.practicadeclase.entidades;

public class Apoyo extends Jugador {

    private Integer curacionesPorPartida;
    private Float eficienciaAsistencia;

    public Apoyo(String alias, Integer puntos,
                 Integer curacionesPorPartida, Float eficienciaAsistencia) {
        super(alias, puntos);
        this.curacionesPorPartida = curacionesPorPartida;
        this.eficienciaAsistencia = eficienciaAsistencia;
    }

    public Integer getCuracionesPorPartida() {
        return curacionesPorPartida;
    }

    public void setCuracionesPorPartida(Integer curacionesPorPartida) {
        this.curacionesPorPartida = curacionesPorPartida;
    }

    public Float getEficienciaAsistencia() {
        return eficienciaAsistencia;
    }

    public void setEficienciaAsistencia(Float eficienciaAsistencia) {
        this.eficienciaAsistencia = eficienciaAsistencia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Apoyo{");
        sb.append("id=").append(id);
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append(", curacionesPorPartida=").append(curacionesPorPartida);
        sb.append(", eficienciaAsistencia=").append(eficienciaAsistencia);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void imprimirRol() {
        IO.println("Apoyo");
    }

}
