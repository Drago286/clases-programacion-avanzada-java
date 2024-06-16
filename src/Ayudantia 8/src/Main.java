import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr = {1,22,5,4,9,3,10,23,8};

        System.out.println("Arreglo original: " + Arrays.toString(arr));
        //quickSort(arr,0,arr.length-1);
        System.out.println("Arreglo ordenado con QuickSort: " + Arrays.toString(arr));

        int [] arr2 = {12,1,5,4,9,23,10,23,8};
        mergeSort(arr2);
        System.out.println("Arreglo ordenado con Mergesort: " + Arrays.toString(arr2));
    }

    public static void quickSort(int [] arreglo, int inicio, int ultimo){
        if (inicio < ultimo) {
            int pivote = particionar(arreglo, inicio, ultimo);
            quickSort(arreglo, inicio, pivote - 1);
            quickSort(arreglo, pivote + 1, ultimo);
        }

    }
    public static int particionar(int [] arreglo, int inicio, int ultimo){
        int pivote = arreglo[ultimo];
        int i = inicio-1;
        for (int j = inicio; j <ultimo ; j++) {
            if (arreglo[j] < pivote){
                i++;
                int aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }
        int aux = arreglo[i+1];
        arreglo[i+1] = arreglo[ultimo];
        arreglo[ultimo] = aux;
        return i+1;
    }

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int medio = arr.length / 2;
            int[] izquierda = Arrays.copyOfRange(arr, 0, medio);
            int[] derecha = Arrays.copyOfRange(arr, medio, arr.length);

            mergeSort(izquierda);
            mergeSort(derecha);
            merge(arr, izquierda, derecha);
        }
    }
    public static void merge(int[] arr, int[] izquierda, int[] derecha) {
        int i = 0, j = 0, k = 0;

        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                arr[k] = izquierda[i];
                i++;
            } else {
                arr[k] = derecha[j];
                j++;
            }
            k++;
        }

        while (i < izquierda.length) {
            arr[k] = izquierda[i];
            i++;
            k++;
        }

        while (j < derecha.length) {
            arr[k] = derecha[j];
            j++;
            k++;
        }
    }


}
