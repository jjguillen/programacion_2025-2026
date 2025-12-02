package tema3.ordenacion;

public class CocktailSort {
    public static void pintar(int[] nums) {
        for(int i=0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void rellenar(int[] nums) {
        for(int i=0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*10000);
        }
    }

    public static void main(String[] args) {

        int[] nums = new int[10000];
        rellenar(nums);

        int aux;
        int i=0, j=nums.length-1;
        boolean bandera = false;
        int contador = 0;

        while (i < j) { //Se encuentran a mitad
            bandera = false;
            contador++;
            for (int k=i; k < j; k++) {
                if (nums[k] > nums[k+1]) {
                    aux = nums[k];
                    nums[k] = nums[k+1];
                    nums[k+1] = aux;
                    bandera = true;
                }
            }
            j--;

            for (int k=j; k > i; k--) {
                if (nums[k] < nums[k-1]) {
                    aux = nums[k];
                    nums[k] = nums[k-1];
                    nums[k-1] = aux;
                    bandera = true;
                }
            }
            i++;

            //pintar(nums);
            //System.out.println();

            //Si en esta iteración no hay más cambios para el algoritmo
            //Ya está ordenado
            if (!bandera) break;
        }

        pintar(nums);
        System.out.println();
        System.out.println("Iteraciones: " + contador);

    }
}
