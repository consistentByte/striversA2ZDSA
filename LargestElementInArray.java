public class LargestElementInArray {

    public static int largestElementInArray(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};
        System.out.println(largestElementInArray(arr));
    }
}
