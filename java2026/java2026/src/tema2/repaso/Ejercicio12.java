package tema2.repaso;

public class Ejercicio12 {

    public static void pintarAsteriscos(int n) {
        for(int j=0; j<n; j++) {
            System.out.print("*");
        }
    }

    public static void pintarEspacios(int n) {
        for(int j=0; j<n; j++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {

        //*
        //**
        //***
        //****

        /*
        for(int i=0; i<=3; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        for(int i=1; i<=4; i++) {
            pintarAsteriscos(i);
            System.out.println();
        }

        System.out.println();

    //   *  - 3e y 1*
    //  **  - 2e y 2*
    // ***  - 1e y 3*
    //****  - 0e y 4*

        for(int i=1; i<=4; i++) {
            pintarEspacios(4-i);
            pintarAsteriscos(i);
            System.out.println();
        }

    //   *      3e y 1* y 0*
    //  ** *    2e y 2* y 1*
    // *** **   1e y 3* y 2*
    //**** ***  0e y 4* y 3*

        for(int i=1; i<=4; i++) {
            pintarEspacios(4-i);
            pintarAsteriscos(i);
            pintarAsteriscos(i-1);
            System.out.println();
        }

        System.out.println();

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=4-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
