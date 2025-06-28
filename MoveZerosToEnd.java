public class MoveZerosToEnd {
    static void moveZeros(int arr[]) {
        //2 pointer
        int zeroIndex = -1; //First occurence of 0
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0 && zeroIndex == -1) {
                zeroIndex = i;

            } else if (arr[i] != 0 && zeroIndex != -1) {
                // non zero and zero Index is on a zero, swap
                arr[zeroIndex] = arr[i];
                arr[i] = 0;
                zeroIndex++;

            }
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0,0,0,0,0,4,0 };
        moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
