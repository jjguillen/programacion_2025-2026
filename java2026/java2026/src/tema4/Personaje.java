package tema4;

public class Personaje {
    //Propiedades clase
    private static final int MAX_SALUD = 200;
    private static final int SALUD_INICIAL = MAX_SALUD / 4;

    //Propiedades
    private String nombre;
    private String clase;
    private Integer salud;
    private Integer mana;
    private Integer damage;
    private Integer nivel;
    //private Arma armaDerecha;

    //Constructor
    public Personaje(String nombre, String clase, Integer mana, Integer damage, Integer nivel) {
        this.nombre = nombre;
        this.clase = clase;
        this.salud = Personaje.SALUD_INICIAL;
        this.mana = mana;
        this.damage = damage;
        this.nivel = nivel;
    }

    //Getters y Setters
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

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    //toString


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", salud=").append(salud);
        sb.append(", mana=").append(mana);
        sb.append(", damage=").append(damage);
        sb.append(", nivel=").append(nivel);
        sb.append('}');
        return sb.toString();
    }

    //Comportamiento ----------------------------------------------------

    /**
     * Resta la cantidad de vida a la salud del personaje
     * Cómo mínimo lo deja con 0 de salud
     * Si se queda en 0 muestra mensaje de muerte
     * @param vida, cantidad de vida a restar
     */
    public void quitarSalud(int vida) {
        this.salud = Math.max(0, this.salud - vida);
        if (this.salud == 0) {
            System.out.println("El personaje (" + this.nombre + ") ha muerto :(");
        }
    }

    /**
     * Revive al personaje
     * Le pone la salud a la salud inicial
     */
    public void revivir() {
        this.salud = Personaje.SALUD_INICIAL;
    }

    /**
     * Resta vida al Personaje enemigo
     * La cantidad de vida a quitar es el daño del personaje más un extra
     * por nivel
     * @param enemigo, personaje enemigo al que se le quita vida
     */
    public void atacar(Personaje enemigo) {
        enemigo.quitarSalud((int) (this.damage * (1 + this.nivel * 0.015)));
    }

    /**
     * Incrementa en uno el nivel del personaje
     * Le suma 20 a la salud del personaje, sin pasarnos de MAX_SALUD
     */
    public void subirNivel() {
        this.nivel++;
        this.salud = Math.min(MAX_SALUD, this.salud + 20);
    }

}
