package tema5.metodosstatic;

import java.util.Objects;

public class CuentaBancaria {

    //Propiedades static
    private static Integer totalCuentas = 0;
    private static Double tasaInteres = 0.02; //Aplicar a todas las cuentas
    private static final String nombreBanco = "BCA";

    //Propiedades no static
    private String idCuenta;
    private Double saldo;
    private String titular;

    //Constructores
    public CuentaBancaria(Double saldo, String titular) {
        CuentaBancaria.totalCuentas++; //Al crear objeto nuevo se incrementa
        this.idCuenta = CuentaBancaria.generarNumeroCuenta();
        this.saldo = saldo;
        this.titular = titular;
    }

    public CuentaBancaria(String idCuenta, String titular) {
        CuentaBancaria.totalCuentas++;
        this.idCuenta = idCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public CuentaBancaria(CuentaBancaria otra) {
        CuentaBancaria.totalCuentas++;
        this.idCuenta = otra.idCuenta;
        this.saldo = otra.saldo;
        this.titular = otra.titular;
    }

    //Getters y Setters
    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaBancaria{");
        sb.append("idCuenta='").append(idCuenta).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append(", titular='").append(titular).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Objects.equals(idCuenta, that.idCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idCuenta);
    }

    //MÉTODOS STATIC
    /**
     * Metodo privado para generar el número de cuenta en los constructores
     * @return
     */
    private static String generarNumeroCuenta(){
        return CuentaBancaria.nombreBanco + "-"
                + String.format("%06d", CuentaBancaria.totalCuentas);
    }

    //MÉTODOS NO STATIC




}
