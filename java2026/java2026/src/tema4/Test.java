package tema4;

public class Test {

    public static void main(String[] args) {
        /**
         * 1. Crea un clase Personaje
         * 2. Debe tener las siguientes propiedades (privadas):
         * - nombre: String
         * - clase: String
         * - salud: int o Integer
         * - mana: int o Integer
         * 3. Crea un constructor que inicialice todas las propiedades
         * 4. Crea los métodos getters y setters para todas las propiedades
         * 5. Crea el toString para que pinte todas las propiedades (StringBuffer)
         * 6. Crea un método void quitarSalud(int vida) que reste esa vida a la del personaje
         * 7. Crea un método void revivir() que ponga la vida a 100.
         * 8. Luego en el main de esta clase crea dos personajes diferentes pers1 y pers2
         * 9. Quítale vida a uno de ellos, dejar uno sin vida, revivirlo
         * 10. Pinta los dos personajes
         *
         * Extra:
         * - Cuando el personaje ataque que quite vida en función del nivel
         * Por ejemplo: damage * (1 + nivel * 0.15)
         * Ojo, hay que pasar double a integer
         * - Cuando la vida de un personaje llegue a 0, mostrar mensaje de muerto
         * - Subir nivel:
         *   a) Cambiamos MAX_SALUD a 200
         *   b) Al crear un personaje le ponemos de vida MAX_SALUD / 4
         *   c) Hacemos un método void subirNivel() que le sume uno al nivel
         *   y sumo 20 de salud al personaje, sin exceder MAX_SALUD
         *
         */

        Personaje pers1 = new Personaje("Gandalf", "Mago", 100, 50, 2);
        Personaje pers2 = new Personaje("Conan", "Guerrero", 0, 60, 4);

        pers1.atacar(pers2);
        pers2.atacar(pers1);

        System.out.println(pers1);
        System.out.println(pers2);

        pers1.atacar(pers2);
        pers2.atacar(pers1);

        //pers2.revivir();

        pers1.subirNivel();

        System.out.println(pers1);
        System.out.println(pers2);

        //pers1 = null;

    }
}
