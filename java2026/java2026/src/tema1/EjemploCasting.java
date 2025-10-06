package tema1;

public class EjemploCasting {
    public static void main(String[] args) {

        int cantidad = 99999;
        long cantidadLong = (long) cantidad;

        System.out.println(cantidadLong);

        cantidadLong = 99999999999999l;
        cantidad = (int) cantidadLong;   //Evitar convertir de grande a pequeño

        System.out.println(cantidad);

        //CASO ESPECIAL --> char

        char caracter = 'J';
        System.out.println(caracter);

        int caracterInt = (int) caracter;  // char --> int
        System.out.println(caracterInt);   // representación ASCII del caracter

        caracterInt = 107;
        caracter = (char) caracterInt;
        System.out.println(caracter);

        caracterInt = 2196;
        caracter = (char) caracterInt;
        System.out.println(caracter);

        while(true) {
            // (int) (Math.random() * (maximo - minimo + 1)) + maximo
            caracterInt = (int) (Math.random() * (10000 - 1 + 1)) + 10000;
            caracter = (char) caracterInt;
            System.out.print(caracter);
        }




    }
}
