import java.util.HashMap;

class SubarrayWithGivenSumK {
    public static int subarrayWithGivenSumKPositives(int arr[], int k) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            if (arr[0] == k) {
                return 1;
            }
            return -1;
        }
        //
        int i = 0, j = 0, sum = arr[0], max = 0;
        while (i <= j && i < arr.length && j < arr.length) {
            if (i == j) {
                if (arr[i] > k) {
                    i++;
                    j++;
                    sum = 0;
                    continue;
                } else {
                    sum = arr[i];
                }
            }

            if (sum > k) {
                while (i < j && sum > k) {
                    sum -= arr[i];
                    i++;
                }
            } else if (sum < k) {
                j++;
                if (j < arr.length) {
                    sum += arr[j];
                }
            } else {
                int len = j - i + 1;
                System.out.println(i + " " + j);
                max = Math.max(max, len);
                j++;
                if (j < arr.length) {
                    sum += arr[j];
                }
            }
        }
        return max;
    }

    static int longestSubarrayWithGivenSumK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = 0;
        int max = 0;
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            x += arr[i];
            int xMinusk = x - k;
            if (map.containsKey(xMinusk)) {
                int idx = map.get(xMinusk);
                max = Math.max(max, (i - (idx + 1) + 1));
            }

            if (!map.containsKey(x)) {
                // Only add psum to map if not present as we do not want to override, since we
                // need longest subarray
                map.put(x, i);
            }
        }
        return max;
    }

    static int subarraySumKCount(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = 0;
        int count = 0;
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            x += arr[i];
            int xMinusk = x - k;
            if (map.containsKey(xMinusk)) {
                // int idx = map.get(xMinusk);
                count += map.get(xMinusk);
            }

            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 3, 4, 5, 6, 9, 2, 1, 1, 1, 2, 5 };
        // int arr[] = { 2, 3, 4, -5, 0, 0, 1, 2, 1 };
        int arr[] = { 1, -1, 0 };
        System.out.println(subarraySumKCount(arr, 0));
    }
}