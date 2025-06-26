import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    static Set<Integer> removeDuplicatesUsingSet(int arr[]) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        return set;
    }

    static ArrayList<Integer> removeDuplicates(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == 0) {
            return list;
        }

        list.add(arr[0]);
        if (arr.length == 1) {
            return list;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != list.get(list.size() - 1)) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    //Without creating new space to store, returns the size of part containing unique elements of array.
     public int removeDuplicatesBetter(int[] arr) {
        //2-pointer
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return 1;
        }
        //j => last index of array part with unique elements of array
        //k => space to add new element at
        int j = 0, k=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[j]) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                j = k; //last index updated
                k++;
            }
        }
        return j+1; //or k
    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        ArrayList<Integer> li = removeDuplicates(arr);
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
    }
}
