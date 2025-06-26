public class MergeSort {

    public static void mergeTwoSortedArrays(int arr[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int l = low, r = mid + 1, k = 0;
        while (l <= mid && r <= high) {
            if (arr[l] <= arr[r]) {
                temp[k++] = arr[l++];
            } else {
                temp[k++] = arr[r++];
            }
        }
        while (l <= mid) {
            temp[k++] = arr[l++];
        }
        while (r <= high) {
            temp[k++] = arr[r++];
        }

        //copy back
        for(int i=0, j = low; i<temp.length; i++, j++) {
            arr[j] = temp[i];
        }
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        mergeTwoSortedArrays(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
