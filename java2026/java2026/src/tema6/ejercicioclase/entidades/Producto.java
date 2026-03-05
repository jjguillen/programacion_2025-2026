package tema6.ejercicioclase.entidades;

public abstract class Producto implements Transportable {
    private String nombre;
    private double peso;

    public Producto(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public abstract boolean esEnvioInternacional();

    @Override
    public double calcularCostoEnvio(boolean esInternacional) {
        double base = 20.0;
        if (esInternacional) base += 30.0;
        return base + (this.peso * 0.2);
    }
}
