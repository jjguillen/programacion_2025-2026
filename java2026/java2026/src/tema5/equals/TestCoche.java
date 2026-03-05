package tema5.equals;

import java.util.ArrayList;

public class TestCoche {
    public static void main(String[] args) {

        Coche c1 = new Coche("Mercedes", "CLA", "gris", "9876-NKR");
        Coche c2 = new Coche(c1);

        System.out.println(c1.equals(c2));

        Coche c3 = new Coche(c1);
        c3.setMatricula("5566-NLT");

        System.out.println(c1.equals(c3));

        //Arraylist
        ArrayList<Coche> coches = new ArrayList<>();
        coches.add(c1);
        coches.add(c2);
        coches.add(c3);
        for(Coche c: coches) {
            System.out.println(c);
        }

        coches.remove(new Coche("", "", "", "9876-NKR"));

        System.out.println("---------------------");
        for(Coche c: coches) {
            System.out.println(c);
        }

        System.out.println("---------------------");
        for(Coche c: coches) {
            /*
            if (c.equals(new Coche("", "", "", "5566-NLT"))) {
                System.out.println("Ese es mi coche -> " + c);
            }
             */

            if (c.getMatricula().equals("5566-NLT")) {
                System.out.println("Ese es mi coche -> " + c);
            }
        }



    }
}
