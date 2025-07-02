import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] leetcodeIndicesWithTwoSum(int arr[], int target) {
        // Since we need indices to return we cannot sort the array.
        // Optimizing Brute to better and improving searching of element using hashmap.

        // Store original indices in a map
        HashMap<Integer, Integer> map = new HashMap<>();
        // Improve fetching using hashmap
        for (int i = 0; i < arr.length; i++) {
            int elementToFind = target - arr[i];
            if (map.containsKey(elementToFind) && map.get(elementToFind) != i) {
                // element is not present and if are not talking of current element
                return new int[] { i, map.get(elementToFind) };
            } else {
                map.put(arr[i], i);
            }
        }

        return new int[] { -1, -1 };
    }

    public static int countWith2Sum(int arr[], int target) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        int count = 0;

        while (i <= j) {
            int sum = arr[i] + arr[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                if (arr[i] == arr[j]) {
                    count += (arr[i] * ((j - i + 1) - 1));
                    break;
                }

                int countI = 0;
                int countJ = 0;
                int elementAtI = arr[i];
                int elementAtJ = arr[j];
                int tempI = i;
                int tempJ = j;
                while (i <= j && arr[tempI] == elementAtI) {
                    countI++;
                    tempI++;
                }
                while (i <= j && arr[tempJ] == elementAtJ) {
                    countJ++;
                    tempJ--;
                }

                count += (countI * countJ);
                i = tempI;
                j = tempJ;

            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 10, 10, 6, 15, 5, 10 };
        // int arr[] = { 2, 2, 2, 2 };
        int ans[] = leetcodeIndicesWithTwoSum(arr, 15);
        System.out.println(ans[0] + " " + ans[1]);
    }
}