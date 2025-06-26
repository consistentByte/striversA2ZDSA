public class QuickSort {

    public static void quickSort_(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        // Taking first element as pivot
        // put smaller elements on left and larger on right
        int pivotIdx = s;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] < arr[pivotIdx]) {
                // push all elements by 1
                int t = i;
                int temp = arr[i];
                while (t > s && t >= pivotIdx) {
                    arr[t] = arr[t - 1];
                    t--;
                }
                // pivot index also shifted
                arr[t] = temp;
                pivotIdx = t + 1;
            }
        }
        quickSort_(arr, s, pivotIdx - 1);
        quickSort_(arr, pivotIdx + 1, e);
    }

    static void quickSort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int partitionIndex = partition(arr, s, e);

        quickSort(arr, s, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, e);

    }

    static int partition(int arr[], int s, int e) {
        // Taking first element as pivot
        // put smaller elements on left and larger on right
        int pivotIdx = s;
        int i = s, j = e;
        while (i < j) {
            // Find first element greater than pivot
            while (i <= j && arr[i] <= arr[pivotIdx]) {
                i++;
            }

            // Find first element smaller than pivot
            while (i <= j && arr[j] > arr[pivotIdx]) {
                j--;
            }

            // If they hadn't crossed swap them
            if (i < j) {
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap farthest smaller than pivot to pivot
        int temp = arr[pivotIdx];
        arr[pivotIdx] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        // int arr[] = { 13, 46, 24, 52, 20, 9 };
        int arr[] = { 4, 6, 2, 5, 7, 9, 1, 3 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
