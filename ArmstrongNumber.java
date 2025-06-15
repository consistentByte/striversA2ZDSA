package striversA2ZDSA;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int n) {
        // count number of digits
        int val = n;
        int count = 0;
        // while (val != 0) {
        // count++;
        // val = val / 10;
        // }

        //Counting digits using log10.
        count = (int) (Math.log10(n) + 1);
        // keep getting digits and add them to check if armstrong number
        val = n;
        int sum = 0;
        while (val != 0) {
            int digit = val % 10;
            sum = (int) (sum + Math.pow(digit, count));
            val = val / 10;
        }
        System.out.println(count + " " + sum);
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }

}
