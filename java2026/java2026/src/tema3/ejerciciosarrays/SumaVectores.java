package tema3.ejerciciosarrays;

public class SumaVectores {
    public static void main(String[] args) {

        //Genera un programa que dados dos vectores de enteros, calcule su suma.
        //Debes almacenarla en un tercer vector de enteros.

        int[] vector1 = {1,2,3,4,5,6,7,8,9,10};
        int[] vector2 = {-1,2,-3,4,-5,6,7,-8,0,10};
        int[] vector3 = new int[10];

        for(int i=0; i < vector1.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        for(int i=0; i < vector3.length; i++) {
            System.out.println(vector3[i]);
        }


    }
}
