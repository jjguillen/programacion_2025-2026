package tema2.condicionales;

public class EjemploIfCondicionLarga {
    public static void main(String[] args) {

        //Entrar en un ciudad en zona baja emisiones
        //Si es eléctrico se puede entra
        //Sino Si es híbrido se puede entra
        //Sino Si es gasolina de bajas emisiones se puede entrar
        //Sino No puedes entrar

        boolean esElec = false;
        boolean esHibrido = false;
        boolean esGasBaja = false;

        if (esElec) {
            System.out.println("Puedes entrar");
        } else {
            if (esHibrido) {
                System.out.println("Puedes entrar");
            } else {
                if (esGasBaja) {
                    System.out.println("Puedes entrar");
                } else {
                    System.out.println("No puedes entrar");
                }
            }
        }

        //Recomendable y óptimo
        if (esElec) {
            System.out.println("Puedes entrar");
        } else if (esHibrido) {
            System.out.println("Puedes entrar");
        } else if (esGasBaja) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }

        //Soy yo quien tiene que poner todas las condiciones
        //y hacer excluyentes
        if (esElec) {
            System.out.println("Puedes entrar");
        }
        if (esHibrido) {
            System.out.println("Puedes entrar");
        }
        if (esGasBaja) {
            System.out.println("Puedes entrar");
        }
        if (!esElec && !esHibrido && !esGasBaja) {
            System.out.println("No puedes entrar");
        }


    }
}
