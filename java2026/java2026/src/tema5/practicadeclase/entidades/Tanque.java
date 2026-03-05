package tema5.practicadeclase.entidades;

public class Tanque extends Jugador  {

    private Double danioRecibido;
    private Double defensaPromedio;

    public Tanque(String alias, Integer puntos, Double danioRecibido, Double defensaPromedio) {
        super(alias, puntos);
        this.danioRecibido = danioRecibido;
        this.defensaPromedio = defensaPromedio;
    }

    public Double getDanioRecibido() {
        return danioRecibido;
    }

    public void setDanioRecibido(Double danioRecibido) {
        this.danioRecibido = danioRecibido;
    }

    public Double getDefensaPromedio() {
        return defensaPromedio;
    }

    public void setDefensaPromedio(Double defensaPromedio) {
        this.defensaPromedio = defensaPromedio;
    }

    @Override
    public void imprimirRol() {
        IO.println("Tanque");
    }

    public void imprimirDatos() {
        imprimirRol();
        IO.println(this.toString());
        IO.println("Daño recibido: " + this.danioRecibido);
        IO.println("Defensa promedio: " + this.defensaPromedio);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tanque{");
        sb.append("id=").append(id);
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append(", danioRecibido=").append(danioRecibido);
        sb.append(", defensaPromedio=").append(defensaPromedio);
        sb.append('}');
        return sb.toString();
    }
}
