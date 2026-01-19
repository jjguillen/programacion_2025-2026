package tema5.herencia.figuras;

public class Figura2D extends Figura {

    public Figura2D(String nombre, Double grosor, String color) {
        super(nombre, grosor, color); //Llama al constructor de la clase padre
    }

    public Double calcularArea() {
        return 0.0;
    }

    public Double calcularPerimetro() {
        return 0.0;
    }

}
