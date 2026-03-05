package tema6.repaso.app;

import tema6.repaso.entidades.Equipamiento;
import tema6.repaso.entidades.RopaDeportiva;
import tema6.repaso.servicios.Tienda;

public class Aplicacion {
    static void main() {

        Tienda tienda = new Tienda();
        tienda.agregarProducto(new Equipamiento("Equipación R.Madrid",
                250.0, 10, "Fútbol"));
        tienda.agregarProducto(new Equipamiento("Equipación Atletico Madrid",
                225.0, 6, "Fútbol"));
        tienda.agregarProducto(new RopaDeportiva("Zapatillas Basket Adidas",
                180.0, 14, "41"));
        tienda.agregarProducto(new RopaDeportiva("Zapatillas Running Trail Adidas",
                280.0, 20, "42"));

        //Menú
        int opcion = 0;
        do {
            IO.println("--- TIENDA ---");
            IO.println("1. Mostrar inventario");
            IO.println("2. Mostrar historial compras");
            IO.println("3. Realizar compra");
            IO.println("4. Salir");
            IO.println("Introduce opción");

            try {
                opcion = Integer.parseInt(IO.readln());
                switch (opcion) {
                    case 1 -> tienda.mostrarInventario();
                    case 2 -> tienda.mostrarHistorialCompras();
                    case 3 -> {
                        IO.println("Introduce código del producto");
                        String codigo = IO.readln();
                        IO.println("Introduce cantidad");
                        int cantidad = Integer.parseInt(IO.readln());
                        tienda.realizarCompra(codigo, cantidad);
                    }
                    case 4 -> IO.println("Hasta pronto");
                }
            } catch (Exception e) {
                IO.println("ERROR: " + e.getMessage());
            }

        } while (opcion != 4);

    }
}
