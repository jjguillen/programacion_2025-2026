package tema7.comparator;

import java.util.Comparator;

public class Producto  {

    private String nombre;
    private String categoria;
    private String descripcion;
    private Double precio;

    public Producto(String nombre, String categoria, String descripcion, Double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", categoria='").append(categoria).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }


}
