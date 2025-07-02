public class Sort012 {
    public static void sort012(int arr[]) {
        int i = 0, z = 0, t = arr.length - 1;
        while (i <= t) {
            if (arr[i] == 2) {
                while (i < t && arr[t] == 2) {
                    t--;
                }
                if (t < 0) {
                    // for [2] case
                    return;
                }
                // swap i,t
                int temp = arr[t];
                arr[t] = arr[i];
                arr[i] = temp;
            }
            // If value was swapped from t it may have 0 or 1, so its better to check for 0
            // after 2.

            if (i <= t && arr[i] == 0) {
                // swap i,z
                int temp = arr[z];
                arr[z] = arr[i];
                arr[i] = temp;
                //
                z++;
            }
            i++;
        }
    }

    public static void dutchNationalFlagAlgo(int arr[]) {
        /*
         * 0 ----- low-1 => 0's
         * low ----mid-1 => 1's
         * mid ----high-1 => unsorted random elements
         * high ---n-1 => 2's
         */
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap mid <--> low
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // arr[mid] => 2
                // swap mid <--> high
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 0, 1, 2, 1, 1, 2 };
        int arr[] = { 2, 0, 1 };
        sort012(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
