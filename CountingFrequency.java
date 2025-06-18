import java.util.HashMap;

public class CountingFrequency {

    public static int countFrequency(int arr[], int x) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        return map.containsKey(x) ? map.get(x) : 0;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };
        System.out.println(countFrequency(arr, 10));
    }
}
