package tema4;

public class ConversorDivisas {

    //Cambio euro - dólar
    //Cambio euro - renminbi
    //Cambio euro - libra

    static final Double CAMBIO_EURO_DOLAR = 1.17;
    static final Double CAMBIO_EURO_RENMINBI = 8.16;
    static final Double CAMBIO_EURO_LIBRA = 0.87;

    public static Double conversorEuroToDolar(Double cantidad) {
        return cantidad * CAMBIO_EURO_DOLAR;
    }

    public static Double conversorEuroToRenminbi(Double cantidad) {
        return cantidad * CAMBIO_EURO_RENMINBI;
    }

    public static Double conversorEuroToLibra(Double cantidad) {
        return cantidad * CAMBIO_EURO_LIBRA;
    }

    public static Double conversorDolarToEuro(Double cantidad) {
        return cantidad / CAMBIO_EURO_DOLAR;
    }

    public static Double conversorRenminbiToEuro(Double cantidad) {
        return cantidad / CAMBIO_EURO_RENMINBI;
    }

    public static Double conversorLibraToEuro(Double cantidad) {
        return cantidad / CAMBIO_EURO_LIBRA;
    }

}
