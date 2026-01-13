package tema4.ejercicios;

public class SteamJuego {

    private String nombre;
    private String descripcionCorta;
    private Double mediaJugadoresDiarios;
    private Integer diasDesdeSalida;
    private Double precio;
    private Integer puestoMasVendidos;

    public SteamJuego(String nombre, String descripcionCorta, Double mediaJugadoresDiarios, Integer diasDesdeSalida, Double precio, Integer puestoMasVendidos) {
        this.nombre = nombre;
        this.descripcionCorta = descripcionCorta;
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
        this.diasDesdeSalida = diasDesdeSalida;
        this.precio = precio;
        this.puestoMasVendidos = puestoMasVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public Double getMediaJugadoresDiarios() {
        return mediaJugadoresDiarios;
    }

    public void setMediaJugadoresDiarios(Double mediaJugadoresDiarios) {
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
    }

    public Integer getDiasDesdeSalida() {
        return diasDesdeSalida;
    }

    public void setDiasDesdeSalida(Integer diasDesdeSalida) {
        this.diasDesdeSalida = diasDesdeSalida;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getPuestoMasVendidos() {
        return puestoMasVendidos;
    }

    public void setPuestoMasVendidos(Integer puestoMasVendidos) {
        this.puestoMasVendidos = puestoMasVendidos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SteamJuego{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", descripcionCorta='").append(descripcionCorta).append('\'');
        sb.append(", mediaJugadoresDiarios=").append(mediaJugadoresDiarios);
        sb.append(", diasDesdeSalida=").append(diasDesdeSalida);
        sb.append(", precio=").append(precio);
        sb.append(", puestoMasVendidos=").append(puestoMasVendidos);
        sb.append('}');
        return sb.toString();
    }

    public void jugadoresDia(int jugadoresHoy) {
        this.mediaJugadoresDiarios =
                ((this.mediaJugadoresDiarios * this.diasDesdeSalida) + jugadoresHoy)
                        / (this.diasDesdeSalida + 1);
    }
}
