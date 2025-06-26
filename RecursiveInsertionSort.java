 public class RecursiveInsertionSort {

    public static void recursiveInsertionSort(int arr[], int n) {
        if(n >= arr.length) {
            return;
        }
        int j = n;
        while(j-1 >= 0 && arr[j] < arr[j-1]) {
            //swap
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;

            j--;
        }
        recursiveInsertionSort(arr, n+1);
    }
    
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        recursiveInsertionSort(arr, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
 }