public class ReverseAnArray {

    public static void reverseAnArrayPR_(int arr[], int ans[], int n) {
        if (n <= 0) {
            return;
        }

        ans[ans.length - n] = arr[n - 1];
        reverseAnArrayPR_(arr, ans, n - 1);
    }

    public static int[] reverseAnArrayPR(int arr[]) {
        int ans[] = new int[arr.length];
        int n = arr.length;
        reverseAnArrayPR_(arr, ans, n);
        return ans;
    }

    public static int[] reverseAnArray(int arr[], int i) {
        if (i == arr.length) {
            int ans[] = {};
            return ans;
        }

        int smallAnsReverseArray[] = reverseAnArray(arr, i + 1);
        // copy to new array of size 1 more
        int ans[] = new int[smallAnsReverseArray.length + 1];
        for (int j = 0; j < smallAnsReverseArray.length; j++) {
            ans[j] = smallAnsReverseArray[j];
        }
        ans[smallAnsReverseArray.length] = arr[i];
        return ans;
    }

    public static int[] reverseAnArrayBetter(int arr[], int i) {
        if (i < 0) {
            int ans[] = {};
            return ans;
        }
        if (i == 0) {
            int ans[] = new int[arr.length];
            ans[i] = arr[(arr.length - 1) - i];
            return ans;
        }

        int smallAnsReverseArray[] = reverseAnArrayBetter(arr, i - 1);
        smallAnsReverseArray[i] = arr[(arr.length - 1) - i];
        return smallAnsReverseArray;
    }

    // Functional Recursion
    // No Copying, no creation of new array
    // Two pointer & recursion
    public static void reverseAnArraySwap(int arr[], int i, int j) {
        if (i >= j) {
            return;
        }
        // swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseAnArraySwap(arr, i + 1, j - 1);
    }

    // Functional Recursion
    // Using single variable
    public static void reverseAnArraySwapBetter(int arr[], int i) {
        if (i >= arr.length / 2) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverseAnArraySwapBetter(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // int ans[] = reverseAnArray(arr, 0);
        // int ans[] = reverseAnArrayBetter(arr, arr.length - 1);
        // int ans[] = reverseAnArrayPR(arr);
        // reverseAnArraySwap(arr, 0, arr.length-1);
        reverseAnArraySwapBetter(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
