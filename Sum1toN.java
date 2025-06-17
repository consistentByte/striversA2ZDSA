public class Sum1toN {

    // Parameterized Recursion
    public static void sum1ToN(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sum1ToN(n - 1, sum + n);
    }

    // Functional Recursion
    public static int sum1ToNBacktrack(int n) {
        if (n <= 1) {
            return n;
        }
        int sumReturnedFromRecursion = sum1ToNBacktrack(n - 1);
        return sumReturnedFromRecursion + n;
    }

    public static void main(String[] args) {
        System.out.println(sum1ToNBacktrack(6));
        // sum1ToN(6, 0);
        ;
    }
}
