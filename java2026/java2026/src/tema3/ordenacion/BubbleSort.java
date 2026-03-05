package tema3.ordenacion;

public class BubbleSort {

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

        for(int i=0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int aux = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = aux;
                }
            }
            //pintar(nums);
            //System.out.println();
        }

        pintar(nums);

    }
}
