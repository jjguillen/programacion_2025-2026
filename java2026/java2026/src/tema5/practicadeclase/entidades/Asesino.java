package tema5.practicadeclase.entidades;

public class Asesino extends Jugador {

    private Float precisionPromedio;
    private Integer bajasPorPartida;

    public Asesino(String alias, Integer puntos,
                   Float precisionPromedio, Integer bajasPorPartida) {
        super(alias, puntos);
        this.precisionPromedio = precisionPromedio;
        this.bajasPorPartida = bajasPorPartida;
    }

    public Float getPrecisionPromedio() {
        return precisionPromedio;
    }

    public void setPrecisionPromedio(Float precisionPromedio) {
        this.precisionPromedio = precisionPromedio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Asesino{");
        sb.append("id=").append(id);
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append(", precisionPromedio=").append(precisionPromedio);
        sb.append(", bajasPorPartida=").append(bajasPorPartida);
        sb.append('}');
        return sb.toString();
    }

    public Integer getBajasPorPartida() {
        return bajasPorPartida;
    }

    public void setBajasPorPartida(Integer bajasPorPartida) {
        this.bajasPorPartida = bajasPorPartida;
    }

    @Override
    public void imprimirRol() {
        IO.println("Asesino");
    }
}
