public class CheckIfArrayIsSorted {
    // Ascending/Increasing/Non-decreasing

    static boolean isArraySorted(int arr[]) {
        // current element greater than previous
        if (arr.length <= 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 6, 7, 8 };
        int arr[] = { 1, 2, 2, 4, 5 };
        System.out.println(isArraySorted(arr));
    }
}
