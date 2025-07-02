public class StockBuyAndSell {
    public static void stockBuyAndSell(int arr[]) {
        int i = 0, j = 0, max = 0, diff = 0;
        while (i < arr.length && j < arr.length) {
            diff = arr[i] - arr[j];
            max = Math.max(max, diff);
            if (diff > 0) {
                j++;
            } else if (diff < 0) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(max);
    }

    public static int stockBuyAndSellOptimal(int arr[]) {
        if (arr.length < 1) {
            return 0;
        }
        int min = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - min;
            maxProfit = Math.max(maxProfit, cost);

            min = Math.min(min, arr[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // int arr[] = { 7, 1, 5, 3, 6, 4 };
        // int arr[] = { 7, 6, 4, 3, 1 };
        int arr[] = { 1, 7, 2, 3, 6, 8, 8, 3 };
        // stockBuyAndSell(arr);
        System.out.println(stockBuyAndSellOptimal(arr));
    }

}
