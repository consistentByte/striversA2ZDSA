public class LeftRotateByD {

    static void leftRotateBetter(int arr[], int d) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }

        // limit it in range
        int d_ = d % n;
        // Shifting
        if (d_ == 0 || d_ == n) {
            return;
        }
        while (d_ > 0) {
            int temp = arr[0];
            for (int i = 1; i < n; i++) {
                // shift
                arr[i - 1] = arr[i];
            }
            arr[n - 1] = temp;
            d_--;
        }
    }

    static void reverse(int arr[], int i, int j) {
        if (arr.length <= 1) {
            return;
        }
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // reverse
    static void leftRotateOptimal(int arr[], int d) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }
        // limit it in range
        int d_ = d % n;
        if (d_ == 0 || d_ == n) {
            return;
        }

        // reverse full
        reverse(arr, 0, n - 1);
        // reverse separately
        int remaningNotRotate = n - d_ - 1;
        reverse(arr, 0, remaningNotRotate);
        reverse(arr, remaningNotRotate + 1, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        leftRotateBetter(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
