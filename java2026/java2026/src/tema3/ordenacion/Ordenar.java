package tema3.ordenacion;

import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {

        int[] nums = { 100, 33, 55, 101, 44, 12, 69, 98 };

        Arrays.sort(nums);

        for(int i=0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        String[] palabras = {"hola", "mundo", "java", "prueba", "casa",
                                "tomate", "zanahora", "array"};
        Arrays.sort(palabras);
        for(int i=0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }



    }

}
