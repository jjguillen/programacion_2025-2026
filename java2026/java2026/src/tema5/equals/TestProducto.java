package tema5.equals;

public class TestProducto {
    public static void main(String[] args) {

        Producto prod1 = new Producto("Iphone17", 1000.0, "Móviles");

        //Copio el objeto con el constructor copia, recordad un nuevo objeto
        Producto prod2 = new Producto(prod1);

        System.out.println(prod1);
        System.out.println(prod2);

        System.out.println(prod1.equals(prod2));

        Producto prod3 = prod1; //son el mismo objeto, la misma referencia

        System.out.println(prod1.equals(prod3));

        /**
         *  RESUMEN:
         *  - equals de object: compara solo referencias, que sean el mismo objeto
         *  - equals sobreescrito: compara que las propiedades de los objetos
         *  tengan los mismos valores
         *
         */




    }
}
