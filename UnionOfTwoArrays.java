import java.util.ArrayList;

public class UnionOfTwoArrays {
    static ArrayList<Integer> union(int arr1[], int arr2[]) {
        // Both arrays are sorted and we have to return one sorted array, but with
        // distinct and unique elements (or no duplicates)
        // modify mergeTwoSortedArrays algo
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {

                if (ans.size() == 0) {
                    ans.add(arr1[i]);
                } else if (ans.size() != 0 && ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
            } else {
                if (ans.size() == 0) {
                    ans.add(arr2[j]);
                } else if (ans.size() != 0 && ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (ans.size() == 0) {
                ans.add(arr1[i]);
            } else if (ans.size() != 0 && ans.get(ans.size() - 1) != arr1[i]) {
                ans.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length) {
            if (ans.size() == 0) {
                ans.add(arr2[j]);
            } else if (ans.size() != 0 && ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }
        return ans;
    }

    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 4, 5 };
        int arr2[] = { 2, 2, 4, 4, 6 };

        ArrayList<Integer> ans = intersection(arr1, arr2);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
