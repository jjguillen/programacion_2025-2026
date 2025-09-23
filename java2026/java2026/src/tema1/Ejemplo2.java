package tema1;

public class Ejemplo2 {
    public static void main(String[] args) {

        //Declara una variable de tipo double llamada precio
        //Asígnale el valor 99.99
        //Pinta por pantalla el precio
        //Pinta por pantalla el precio con el IVA (21%)

        //Calcular un porcentaje es multiplicar por 0.<porcentaje>
        //Calcular el total con el porcentaje es multiplicar por 1.<porcentaje>

        double precio = 0.0;
        double iva = 0.0;

        precio = 99.99;
        iva = precio * 21 / 100; //precio * 0.21

        System.out.println("El precio es: " + precio);
        System.out.println("El precio con IVA es: " + (precio + iva));

    }
}
