package striversA2ZDSA;

public class GcdOfTwoNumbers {

    public static int gcdBrute(int a, int b) {
        int maxDiv = Math.min(a, b);
        int ans = 1;
        for (int i = 1; i <= maxDiv; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                ans = i;
            }
        }
        return ans;
    }

    public static int gcdBetter(int a, int b) {
        // edge complexity same, but lesser average case complexity
        int maxDiv = Math.min(a, b);
        int ans = 1;
        for (int i = maxDiv; i >= 1; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static int gcdOptized(int a, int b) {
        // Euclidean algo modifier
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        } else
            return a;
    }

    public static void main(String[] args) {
        System.out.println(gcdOptized(27, 63));
    }
}
