package tema5.interfaces;

import java.util.Objects;

public class Producto {

    private String nombre;
    private Double precio;
    private String categoria;

    public Producto(String nombre, Double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Producto(Producto otro) {
        this.nombre = otro.nombre;
        this.precio = otro.precio;
        this.categoria = otro.categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", categoria='").append(categoria).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(this.nombre, producto.nombre) && Objects.equals(precio, producto.precio) && Objects.equals(categoria, producto.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, categoria);
    }
}
