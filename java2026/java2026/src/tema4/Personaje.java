package tema4;

public class Personaje {
    //Propiedades clase
    private static final int MAX_SALUD = 100;

    //Propiedades
    private String nombre;
    private String clase;
    private Integer salud;
    private Integer mana;
    private Integer damage;
    private Integer nivel;

    //Constructor
    public Personaje(String nombre, String clase, Integer mana, Integer damage, Integer nivel) {
        this.nombre = nombre;
        this.clase = clase;
        this.salud = Personaje.MAX_SALUD;
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
    public void quitarSalud(int vida) {
        this.salud = Math.max(0, this.salud - vida);
    }

    public void revivir() {
        this.salud = Personaje.MAX_SALUD;
    }

    public void atacar(Personaje enemigo) {
        enemigo.quitarSalud(this.damage);
    }

}
