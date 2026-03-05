package tema4;

public class Regalo {

    //Propiedades o atributos
    private String nombre;
    private Categoria categoria;
    private Double precio;

    //Constructor
    public Regalo(String nombre, Categoria categoria, Double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Regalo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    //Metodos propios

    /**
     * Incrementa el precio en un porcentaje
     * @param porcentaje
     */
    public void subirPrecio(Double porcentaje){
        this.precio = this.precio * (1 + porcentaje/100);
    }

    /**
     * Incrementa el precio aplicándole el IVA correspondiente
     * @param iva porcentaje de IVA (10%, 21%, ...)
     */
    public void aplicarIVA(Double iva) {
        this.precio = this.precio * (1 + iva/100);
    }



}
