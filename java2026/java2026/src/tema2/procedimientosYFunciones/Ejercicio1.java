package tema2.procedimientosYFunciones;

public class Ejercicio1 {

    /**
     * Función que devuelve un int aleatorio en el rango min y max
     * @param min
     * @param max -> debe ser mayor que min
     * @return
     */
    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {

        //Crea una función que genere un número aleatorio entre
        //un número entero mínimo y un máximo, y lo devuelva (return)
        //generarAleatorio(int min, int max)
        //Pruébala desde el main llamándola con:
        //generarAleatorio(1, 100)
        //generarAleatorio(-100, 100)
        //generarAleatorio(100, 200)
        //int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>))

        System.out.println(generarAleatorio(1,100));
        System.out.println(generarAleatorio(-100,100));
        System.out.println(generarAleatorio(100,200));


    }
}
