package tema4;

public class TestRegalo {
    public static void main(String[] args) {

        Regalo regalo1 = new Regalo("Iphone 17 pro", Categoria.Tecnologia, 1000.0);
        Regalo regalo2 = new Regalo("Chaqueta vaquera", Categoria.Ropa, 200.0);

        System.out.println(regalo1);
        regalo1.setPrecio(990.0);
        regalo1.aplicarIVA(21.0);
        System.out.println(regalo1);




    }
}
