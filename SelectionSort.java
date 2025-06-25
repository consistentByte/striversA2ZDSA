public class SelectionSort {

    public static void selectionSort(int arr[]) {
        // u represents first unsorted index.
        for (int u = 0; u < arr.length; u++) {

            int minIdx = u;
            for (int i = u; i < arr.length; i++) {
                if (arr[i] < arr[minIdx]) {
                    minIdx = i;
                }
            }
            // swap from minimum
            int temp = arr[u];
            arr[u] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
