public class MaximumSubarraySum {
    public static int maxSum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0, sum = arr[0];
        while (i < arr.length && j < arr.length) {
            max = Math.max(max, sum);
            if (sum >= 0) {
                // +ve
                j++;
                if (j >= arr.length)
                    break;
                sum += arr[j];
            } else {
                // -ve
                if (i == j) {
                    i++;
                    j++;
                    if (i >= arr.length)
                        break;
                    sum = arr[i];
                } else {
                    if (i >= arr.length)
                        break;
                    sum -= arr[i];
                    i++;
                }
            }
        }

        return max;
    }

    public static void printSubarrayWithMaxSum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int ansI = 0, ansJ = 0;
        int i = 0, j = 0, sum = arr[0];
        while (i < arr.length && j < arr.length) {
            if (sum > max) {
                ansI = i;
                ansJ = j;
                max = sum;
            }

            if (sum >= 0) {
                // +ve
                j++;
                if (j >= arr.length)
                    break;
                sum += arr[j];
            } else {
                // -ve
                if (i == j) {
                    i++;
                    j++;
                    if (i >= arr.length)
                        break;
                    sum = arr[i];
                } else {
                    if (i >= arr.length)
                        break;
                    sum -= arr[i];
                    i++;
                }
            }
        }
        // System.out.println(ansI + " " + ansJ);
        if (ansJ == arr.length) {
            ansJ--;
        }
        for (i = ansI; i <= ansJ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int kadaneAlgo(int arr[]) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void kadaneAlgoPrintSubarrayWithMaxSum(int arr[]) {
        int sum = 0, max = Integer.MIN_VALUE;
        int tempStart = 0;
        int start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                // start of new considered subarray
                tempStart = i;
            }
            sum += arr[i];

            if (sum > max) {
                max = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int arr[] = { 4, -1, 2, 1 };
        // int arr[] = { -1, -1, -1, -1 };
        // printSubarrayWithMaxSum(arr);
        kadaneAlgoPrintSubarrayWithMaxSum(arr);
        // System.out.println(kadaneAlgo(arr));
    }
}
