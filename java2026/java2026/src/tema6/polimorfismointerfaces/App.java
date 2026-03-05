package tema6.polimorfismointerfaces;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main() {

        //En la colección puede meter todo tipo de objetos siempre
        //que implementen el interfaz Renderizable
        List<Renderizable> renderizables = new ArrayList<>();
        Casa3D casita = new Casa3D(100, 50, 25, 4500.0);
        Palmera palmeron = new Palmera(1,25,"Palmirus palmiriensis");

        renderizables.add(casita);
        renderizables.add(palmeron);

        for(Renderizable rs: renderizables) {
            //Solo puedo invocar métodos de Renderizable
            rs.init();
            rs.render();
            rs.update();
            rs.dispose();

            IO.println("------- CASTING --------");
            if (rs instanceof Casa3D) {
                Casa3D c = (Casa3D) rs;
                IO.println(c);
            }
            if (rs instanceof Palmera) {
                Palmera p = (Palmera) rs;
                IO.println(p);
            }
        }



    }
}
