package tema5.metodosstatic;

public class Test {
    public static void main(String[] args) {

        CuentaBancaria cc1 = new CuentaBancaria(100000.0, "Daniel Sánchez");
        CuentaBancaria cc2 = new CuentaBancaria(500.0, "Alicia Ramos");

        cc1.depositar(700.0);
        cc2.retirar(100.0);
        cc2.retirar(500.0);

        System.out.println(cc1);
        System.out.println(cc2);

        //Cambiamos la remuneración al 5%
        CuentaBancaria.setTasaInteres(0.05);

        System.out.println("El banco tiene: " + CuentaBancaria.getTotalCuentas() + " cuentas");
        System.out.println("El banco genera para " + cc1.getIdCuenta()
                + " a final de año " + cc1.calcularBeneficio());
        System.out.println("El banco genera para " + cc2.getIdCuenta()
                + " a final de año " + cc2.calcularBeneficio());



    }
}
