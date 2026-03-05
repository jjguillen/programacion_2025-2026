package tema5.equals;

import java.util.Objects;

public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private String matricula;

    public Coche(String marca, String modelo, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
    }

    public Coche(Coche otro) {
        this.marca = otro.marca;
        this.modelo = otro.modelo;
        this.color = otro.color;
        this.matricula = otro.matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Coche{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}
