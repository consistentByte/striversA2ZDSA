public class RecursiveBubbleSort {
// Intuition: solve first round of BS and leave the other for recursion.

    //If no swap in first iteration then already sorted.
    public static void recursiveBubbleSort(int arr[], int n) {
        if (n == 0) {
            return;
        }
        boolean flag = true;
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                flag = false;
            }
        }
        if(flag) {
            return;
        }
        recursiveBubbleSort(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        recursiveBubbleSort(arr, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
