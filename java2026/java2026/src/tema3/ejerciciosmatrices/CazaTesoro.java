package tema3.ejerciciosmatrices;

public class CazaTesoro {
    /**
     * Escribe un programa en Java que simule un juego de la caza del tesoro. En
     * este juego, el tablero estará representado por una matriz 10x10 y el objetivo es
     * encontrar el tesoro escondido en una de las celdas del tablero. El jugador debe
     * ingresar coordenadas para intentar encontrar el tesoro.
     * Reglas del juego:
     * 1. El tablero tiene dimensiones de 10x10, inicialmente vacías ‘-’.
     * 2. Se coloca un tesoro en una casilla aleatoria del tablero.
     * 3. El jugador hará intentos para localizar el tesoro, dando la coordenada x y la
     * coordenada y donde cree que está el tesoro.
     * 4. El jugador tiene 15 intentos para encontrar el tesoro.
     * 5. Después de cada intento, el juego dará pistas:
     * • Si el jugador dispara a una casilla más cerca del tesoro (en términos
     * de distancia), se le da la pista "Estás más cerca del tesoro".
     * • Si el jugador dispara a una casilla más alejada, se le da la pista "Estás
     * más lejos del tesoro".
     * • Si la distancia es menor que la anterior, el jugador está más cerca. Si
     * es mayor, está más lejos.
     * • La distancia puede calcularse usando la distancia de Manhattan
     * que se calcula como la suma del valor absoluto de la resta de las
     * coordenadas x, más el valor absoluto de la resta de las coordenadas
     * y. Donde (x1,y1) es el punto donde está el tesoro, y (x2,y2) es el
     * punto donde tú pruebas.
     * Distancia = ∣x1 - x2∣ + ∣y1 - y2∣
     * 6. El jugador debe seguir intentando hasta encontrar el tesoro o agotar sus
     * intentos.
     * 7. Si el jugador encuentra el tesoro, el juego termina y se muestra un mensaje
     * de victoria. Si se quedan sin intentos, se muestra un mensaje de derrota.
     */


    public static void main(String[] args) {

        /**
         *   Distancia anterior = 10
         *   Distancia actual = 2
         *                          Disp. Tesoro
         *   --*-------    (i,j) -> (0,3) (4,7) -> Distancia = |4-0| + |7-3| = 10
         *   ----------
         *   ----*-----
         *   ----------
         *   -----*-T--
         *   ----------
         *   ----------
         *   ----------
         *   ----------
         *   ----------
         *
         */


    }
}
