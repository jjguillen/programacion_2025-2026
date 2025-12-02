package tema3.ordenacion;

public class QuicksortBasico {

    public static void quicksort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        quicksort(arr, 0, arr.length - 1);
    }

    private static void quicksort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            // Obtener el índice del pivote en su posición correcta
            int indicePivote = particionar(arr, inicio, fin);

            // Ordenar recursivamente las dos mitades
            quicksort(arr, inicio, indicePivote - 1);
            quicksort(arr, indicePivote + 1, fin);
        }
    }

    private static int particionar(int[] arr, int inicio, int fin) {
        // Elegir el último elemento como pivote
        int pivote = arr[fin];
        int i = inicio - 1; // Índice del elemento más pequeño

        for (int j = inicio; j < fin; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (arr[j] <= pivote) {
                i++;
                intercambiar(arr, i, j);
            }
        }

        // Colocar el pivote en su posición correcta
        intercambiar(arr, i + 1, fin);
        return i + 1;
    }

    private static void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rellenar(int[] nums) {
        for(int i=0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*10000);
        }
    }

    // Método para probar el algoritmo
    public static void main(String[] args) {
        int[] numeros = new int[10000];
        rellenar(numeros);

        System.out.println("Array original:");
        imprimirArray(numeros);

        quicksort(numeros);

        System.out.println("\nArray ordenado:");
        imprimirArray(numeros);
    }

    private static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
