public class FibonacciNumber {

    public static void fibonacciNumber_(int a, int b, int i, int n) {
        if (i > n) {
            // b was the sum of previous iteration
            return;
        }
        if (i == 0) {
            System.out.print("0 ");
            fibonacciNumber_(a, b, i + 1, n);
            return;
        }
        if (i == 1) {
            System.out.print("1 ");
            fibonacciNumber_(a, b, i + 1, n);
            return;
        }

        int sum = a + b;
        System.out.print(sum + " ");
        fibonacciNumber_(b, sum, i + 1, n);
    }

    public static void fibonacciNumber(int n) {
        fibonacciNumber_(0, 1, 0, n);
    }

    // Multiple Recursion Calls
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}