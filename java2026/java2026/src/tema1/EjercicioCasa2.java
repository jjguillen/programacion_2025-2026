package tema1;

public class EjercicioCasa2 {
    public static void main(String[] args) {

        //Un conductor de coche quiere saber cuánta gasolina consume en un viaje.
        //Su coche consume 5.8 litros de gasolina cada 100km
        //Cuantos litros consume en un viaje de 750km

        //Ahora haz el mismo ejercicio pero pensando que el coche es híbrido y
        //tiene una batería cargada completamente de 120km

        //Si cada litro de gasolina cuesta 1.43€, ¿cuánto se gasta en cada viaje?

        //Muestra con un operador condicional, si el gasto en litros de gasolina
        //es mayor en el primer coche o en el segundo

        //ANÁLISIS
        //V.E.: consumoMedio=5.8, distanciaViaje=750
        //V.S.: litrosConsumidosViaje ?

        //DISEÑO
        //Regla de tres, si en 100km consume 5.8, en 750 consume -> 750 * 5.8 / 100
        //Igual, pero a 750km le restamos los 120km que hace con la batería eléctrica

        double consumoMedio = 5.8, precioLitroGasolina=1.46;
        int distanciaViaje = 750;
        double litrosConsumidosViaje = 0, litrosConsumidosViajeH = 0;

        litrosConsumidosViaje = distanciaViaje * consumoMedio / 100;
        System.out.println("En este viaje el coche ha consumido: " + litrosConsumidosViaje
                + " litros de combustible");
        System.out.println("El viaje cuesta " + (litrosConsumidosViaje * precioLitroGasolina) + "€");

        litrosConsumidosViajeH = (distanciaViaje - 120) * consumoMedio / 100;
        System.out.println("En este viaje el coche (híbrido) ha consumido: "
                + litrosConsumidosViajeH + " litros de combustible");
        System.out.println("El viaje cuesta " + (litrosConsumidosViajeH * precioLitroGasolina)  + "€");

        //Muestra con un operador condicional, si el gasto en litros de gasolina
        //es mayor en el primer coche o en el segundo
        // SI CONDICION ES TRUE {} ELSE {}
        // litrosConsumidosViaje gasolina < litroConsumidosViaje híbrido

        System.out.println((litrosConsumidosViaje < litrosConsumidosViajeH));
        if (litrosConsumidosViaje < litrosConsumidosViajeH) {
            System.out.println("Consume más el híbrido");
        } else {
            System.out.println("Consume más el de gasolina");
        }

    }
}
