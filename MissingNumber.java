public class MissingNumber {

    static int missingNumberSumApproach(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int expectedSum = (arr.length * (arr.length + 1) / 2);
        return expectedSum - sum;
    }

    static int missingNumberXorApproach(int arr[]) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
            xor ^= (i + 1);
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1 };
        System.out.println(missingNumberXorApproach(arr));
    }
}
