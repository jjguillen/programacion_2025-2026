package tema5.referenciathis;

public class Rectangulo implements Cloneable {
    private Double ancho;
    private Double alto;

    public Rectangulo(Double ancho, Double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangulo{");
        sb.append("ancho=").append(ancho);
        sb.append(", alto=").append(alto);
        sb.append('}');
        return sb.toString();
    }

    public Rectangulo incrementarAncho() {
        this.ancho++;
        return this; //Estamos devolviendo una referencia al mismo objeto
    }

    public Rectangulo incrementarAlto() {
        this.alto++;
        return this;
    }


    @Override
    public Rectangulo clone() {
        try {
            Rectangulo clone = (Rectangulo) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
