import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AppearsOnceOtherNumbersTwice {
    static int appearsOnceOtherNumbersTwice(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        Set<Integer> st = map.keySet();
        System.out.println(map.toString());
        Iterator<Integer> it = st.iterator();
        int ans = -1;
        
        int currentElement;
        while(it.hasNext()) {
            currentElement = it.next();
            if(map.get(currentElement) == 1) {
                ans = currentElement;
                break;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        System.out.println(appearsOnceOtherNumbersTwice(arr));
    }

}
