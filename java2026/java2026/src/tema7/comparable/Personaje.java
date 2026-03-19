package tema7.comparable;

public class Personaje implements Comparable<Personaje>{
    private String nombre;
    private String clase;
    private Integer nivel;
    private Integer vida;

    public Personaje(String nombre, String clase, int nivel, int vida) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", vida=").append(vida);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Personaje o) {
        //Ordenamos alfabéticamente por nombre
        return this.nombre.compareTo(o.nombre);
    }
}
