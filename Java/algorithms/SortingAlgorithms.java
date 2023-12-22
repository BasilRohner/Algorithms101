package algorithms;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.stream.IntStream;

public class SortingAlgorithms {

    public static final int SAMPLES = 10;
    private static int[] generateRndArray() {
        Random gen = new Random();
        return Arrays.stream(new int[SAMPLES]).map(a -> gen.nextInt())
                .map(a -> a % SAMPLES).map(Math::abs).toArray();
    }

    public static void main(String[] args) {

        int[] result = generateRndArray();
        bogoSort(result);
        System.out.println("Bogo-Sort:"+Arrays.toString(result));
        assert !isSorted(result); // Should not be sorted

        result = generateRndArray();
        bubbleSort(result);
        System.out.println("Bubble-Sort:"+Arrays.toString(result));
        assert isSorted(result); // Should be sorted

        result = generateRndArray();
        selectionSort(result);
        System.out.println("Selection-Sort:"+Arrays.toString(result));
        assert isSorted(result); // Should be sorted

        result = generateRndArray();
        insertionSort(result);
        System.out.println("Insertion-Sort:"+Arrays.toString(result));
        assert isSorted(result); // Should be sorted

        result = generateRndArray();
        mergeSort(result);
        System.out.println("Merge-Sort:"+Arrays.toString(result));
        assert isSorted(result); // TODO

        result = generateRndArray();
        quickSort(result);
        System.out.println("Quick-Sort:"+Arrays.toString(result));
        assert isSorted(result); // TODO

        result = generateRndArray();
        rndQuickSort(result);
        System.out.println("Randomized-Quick-Sort:"+Arrays.toString(result));
        assert isSorted(result); // TODO

        result = generateRndArray();
        medQuickSort(result);
        System.out.println("Median-Quick-Sort:"+Arrays.toString(result));
        assert isSorted(result); // TODO

    }

    @SuppressWarnings("unused")
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) return false;
        } return true;
    }

    @SuppressWarnings("unused")
    public static void bogoSort(int[] arr) {
        Random generator = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = generator.nextInt(arr.length);
            int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
        }
    }

    @SuppressWarnings("unused")
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1]; arr[j-1] = arr[j]; arr[j] = temp;
                }
            }
        }
    }

    @SuppressWarnings("unused")
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[arr.length-1-i]) {
                    int temp = arr[j]; arr[j] = arr[arr.length-1-i]; arr[arr.length-1-i] = temp;
                }
            }
        }
    }

    @SuppressWarnings("unused")
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1]; arr[j-1] = arr[j]; arr[j] = temp; j--;
                }
            }
        }
    }

    @SuppressWarnings("unused")
    public static void mergeSort(int[] arr) {
        // TODO
    }

    @SuppressWarnings("unused")
    private static int[] merge(int[] arr1, int[] arr2) {
        // TODO
        return new int[3];
    }

    @SuppressWarnings("unused")
    public static void heapSort(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int j : arr) heap.add(j);
        for (int i = 0; i < heap.size(); i++) {
            arr[i] = heap.poll();
        }
    }

    @SuppressWarnings("unused")
    public static void quickSort(int[] arr) {
        int pivot = arr.length-1;
    }

    @SuppressWarnings("unused")
    public static void rndQuickSort(int[] arr) {
        Random generator = new Random();
        int pivot = Math.abs(generator.nextInt() % arr.length);
        // TODO
    }

    @SuppressWarnings("unused")
    public static void quickSelect(int[] arr) {
        // TODO
    }

    @SuppressWarnings("unused")
    public static void medQuickSort(int[] arr) {
        // TODO
    }

}
