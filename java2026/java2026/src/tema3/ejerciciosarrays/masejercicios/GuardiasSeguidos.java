package tema3.ejerciciosarrays.masejercicios;

public class GuardiasSeguidos {

    public static boolean comprobarVDani(boolean[] guardias) {
        //Recorrer el array de booleanos y verificar si hay tres seguidos
        //true

        int contadorGuardias=0;
        for(int i = 0; i < guardias.length; i++) {
            if (guardias[i]) {
                contadorGuardias++;
            } else {
                contadorGuardias=0;
            }

            if (contadorGuardias == 3) {
                return true;
            }
        }

        return false;
    }

    public static boolean comprobar(boolean[] guardias) {
        //Recorrer el array de booleanos y verificar si hay tres seguidos
        //true

        for(int i = 0; i < guardias.length - 2; i++) {
            if (guardias[i] && guardias[i+1] && guardias[i+2]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Dado un array de booleanos que representan guardias (true) y no
        // guardias (false), escribe un programa que determine si hay al menos
        // tres guardias seguidos en el array.
        // Utiliza una función que reciba el array y devuelva true o false.
        // Ojo: el array puede tener cualquier tamaño.
        // Ojo!, te puedes pasar al comprobar

        boolean[] guardias = {true, true, false, true, false, true, false, true};

        System.out.println(comprobarVDani(guardias));

    }
}
