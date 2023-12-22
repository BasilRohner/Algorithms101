package algorithms;

public class SearchingAlgorithms {

    /**
     * Linear Search Algorithm
     * @param arr input array searched
     * @param target target element
     * @return idx of element
     */
    @SuppressWarnings("unused")
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        } return -1;
    }

    /**
     * Linear Search Algorithm Approximate
     * @param arr input array searched
     * @param target target element
     * @return idx of element closest to target
     */
    @SuppressWarnings("unused")
    public static int linearSearchApprox(int[] arr, int target) {
        int delta = 0; int opt = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (opt > Math.abs(target - arr[i])) {
                delta = i; opt = Math.abs(target - arr[i]);
            }
        } return delta;
    }

    /**
     * Binary Search Algorithm
     * @param arr sorted input array searched
     * @param target target element
     * @return idx of element
     */
    @SuppressWarnings("unused")
    public static int binarySearch(int[] arr, int target) {

        int mid; int right = arr.length; int left = 0;
        do { mid = (right-left) / 2;
            if (arr[mid] < target) { right = mid; }
            else { left = mid; }
        } while (arr[mid] != target && left < right);
        return arr[mid] == target ? mid : -1;

    }

    /**
     * Binary Search Algorithm Approximated
     * @param arr sorted input array searched
     * @param target target element
     * @return idx of element closest to target
     */
    @SuppressWarnings("unused")
    public static int binarySearchApprox(int[] arr, int target) {

        int mid; int right = arr.length; int left = 0;
        do { mid = (right-left) / 2;
            if (arr[mid] < target) { right = mid; }
            else { left = mid; }
        } while (arr[mid] != target && left < right);
        return mid;

    }

    @SuppressWarnings("unused")
    public static int interpolationSearch(int[] arr, int target) {
        return -1;
    }

    @SuppressWarnings("unused")
    public static int exponentialSearch(int[] arr, int target) {
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7};
        System.out.println(linearSearchApprox(array, 8));
        System.out.println(linearSearch(array, 7));
        System.out.println(linearSearch(array, 8));
    }

}
