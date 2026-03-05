package tema1.ejerciciosRepaso;

public class Ej9 {
    public static void main(String[] args) {

        //Punto1 (x1,y1)
        //Punto2 (x2,y2)
        double x1,y1,x2,y2;
        double distancia;

        x1=45.66;
        y1=66.98;

        x2=66.98;
        y2=45.66;

        distancia = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ) ;

        System.out.println("La distancia entre los dos puntos es: " + distancia);

    }
}
