class CountMaxConsecutiveOne {
    static int countMaxConsecutiveOne(int arr[]) {
        int countOne = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                max = Math.max(max, countOne);
                countOne = 0;
            } else {
                countOne++;
            }
        }
        max = Math.max(max, countOne);

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1 };
        System.out.println(countMaxConsecutiveOne(arr));
    }
}