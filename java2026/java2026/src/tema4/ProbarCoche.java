package tema4;

public class ProbarCoche {
    public static void main(String[] args) {

        Coche c1 = new Coche("Mercedes","Clase C", "Negro", 2024); //Crear un objeto Coche
        System.out.println(c1);

        Coche c2 = new Coche("BMW", "X5", "Rojo", 2025);
        System.out.println(c2);
        c2.setColor("Negro");
        c2.setAnio(2024);
        System.out.println(c2);

        System.out.println(c1.arrancar());

        System.out.println(c1.arrancar().toUpperCase().concat("....."));

        System.out.println(c2.getAnio());

        c1 = null; //No apunta a ningún sitio, y el GC liberará la memoria asociada
        c2 = null;

    }
}
