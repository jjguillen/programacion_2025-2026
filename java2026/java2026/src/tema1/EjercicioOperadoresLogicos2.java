package tema1;

public class EjercicioOperadoresLogicos2 {
    public static void main(String[] args) {

        //Un cliente recibe un descuento especial si se cumplen estas condiciones:
        //Es miembro VIP y su compra supera 100€ O
        //No es VIP pero es su cumpleaños y la compra es mayor a 50€
        //En ningún caso hay descuento si el cliente tiene pagos pendientes

        boolean clienteVip;
        double valorCompra;
        boolean esCumpleaños;
        boolean tienePagosPendientes;
        boolean aplicaDescuento;

        //Dar valor a las variables de entrada
        //Poner la condición
        //Ver lo que debe dar y comprobar el resultado pintándolo

        clienteVip = false;
        valorCompra = 49;
        esCumpleaños = true;
        tienePagosPendientes = false;

        /*
        aplicaDescuento = ( (clienteVip && valorCompra > 100) ||
                (clienteVip == false && esCumpleaños == true && valorCompra > 50) ) &&
                (tienePagosPendientes == false);
        */

        aplicaDescuento = ( (clienteVip && valorCompra > 100) ||
                (!clienteVip && esCumpleaños && valorCompra > 50) ) &&
                (!tienePagosPendientes);


        System.out.println("Tiene descuento " + aplicaDescuento);



    }
}
