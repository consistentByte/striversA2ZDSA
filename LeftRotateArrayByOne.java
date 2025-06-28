public class LeftRotateArrayByOne {
    
    static void reverse(int arr[], int i, int j) {
        while(i<j) {
            //swap i, j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void leftRotateByOneUsingReverse(int arr[]) {
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, arr.length-2);
    } 

    static void leftRotateByOne(int arr[]) {
        if(arr.length <= 1) {
            return;
        }
        int temp = arr[0];
        for(int i=1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        leftRotateByOneUsingReverse(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
