package striversA2ZDSA;

public class ReverseANumber {

    public static int reverseANumberUsingString(int n_) {
        /*
         * If signed remove the signed and add the sign after reversing
         * Problem in this solution
         * since 1 extra negative number is stored that is -2147483648 in int, if we
         * remove sign using Math.abs, 2147483648 that is out of range so moves back to
         * -ve side in cycle,
         * Better way in order to use string is to convert the number to string, and
         * reverse the string then convert back to int if possible else return 0 if out
         * of range.
         * 
         */
        int n = Math.abs(n_);
        String ans = "" + n % 10;
        int val = n / 10;
        while (val != 0) {
            ans = ans + (val % 10);
            val = val / 10;
        }
        if (n < 0) {
            ans = "-" + ans;
        }
        return Integer.parseInt(ans);
    }

    public static int reverseANumber(int n) {
        long ans = 0;
        int val = n;
        while (val != 0) {
            int lastDigit = val % 10;
            long temp = ans * 10;
            if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
                return 0;
            }
            ans = temp + lastDigit;
            val = val / 10;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        // 1534236469, -2147483648
        System.out.println(reverseANumber(-2147483648));
    }
}
