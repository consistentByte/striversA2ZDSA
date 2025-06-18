import java.util.HashMap;
import java.util.Set;

public class HighestAndLowestFrequency {

    public static void highestAndLowestFreq(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Set<Integer> keys = map.keySet();

        // min, max
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (Integer key : keys) {
            min = Math.min(min, map.get(key));
            max = Math.max(max, map.get(key));
        }

        System.out.println(min+" "+max);
    }

    public static void main(String[] args) {
        int arr[] = {2,2,3,4,4,2};
        highestAndLowestFreq(arr);
    }
}
