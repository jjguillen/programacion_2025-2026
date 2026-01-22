package tema4.practica1.blackdarkness;

public class Jugador {

    enum claseJugador {MAGO, BRUJO, BARBARO, CABALLERO}

    private String nombre;
    private claseJugador clase;
    private int nivel;
    private int experiencia;
    private int salud;
    private Arma armaDerecha;
    private Arma armaIzquierda;

    public Jugador(String nombre, claseJugador clase) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = 1;
        this.experiencia = 0;
        this.salud = 200;
        this.armaDerecha = null;
        this.armaIzquierda = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public claseJugador getClase() {
        return clase;
    }

    public void setClase(claseJugador clase) {
        this.clase = clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append('}');
        return sb.toString();
    }

    public boolean equipar(Arma arma) {
        //1. Dos manos
        if (arma.isDosManos()) {
            if (this.armaDerecha == null && this.armaIzquierda == null) {
                this.armaDerecha = arma;
                this.armaIzquierda = arma; //No haría falta
                return true;
            } else {
                //No se puede equipar
                return false;
            }
        } else {
            if (this.armaDerecha == null) {
                this.armaDerecha = arma;
                return true;
            } else if (this.armaIzquierda == null) {
                this.armaIzquierda = arma;
                return true;
            } else {
                return false;
            }

        }

    }


}
