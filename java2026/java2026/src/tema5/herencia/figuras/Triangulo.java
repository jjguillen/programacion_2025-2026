package tema5.herencia.figuras;

public class Triangulo extends Figura2D {
    private Double base;
    private Double altura;

    public Triangulo(String nombre, Double grosor, String color,
                     Double base, Double altura) {
        super(nombre, grosor, color);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangulo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", grosor=").append(grosor);
        sb.append(", color='").append(color).append('\'');
        sb.append(", base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public Double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public Double calcularPerimetro() {
        return base * 3;
    }


}
