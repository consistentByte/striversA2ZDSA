public class InsertionSort {

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            // Unsorted part i -> arr.length-1
            int indexToBeSorted = i;
            for (int j = i - 1; j >= 0; j--) {
                // Sorted part 0 -> i-1
                if (arr[indexToBeSorted] < arr[j]) {
                    int temp = arr[indexToBeSorted];
                    arr[indexToBeSorted] = arr[j];
                    arr[j] = temp;
                    indexToBeSorted = j;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
