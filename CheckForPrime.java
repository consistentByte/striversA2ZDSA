package striversA2ZDSA;

public class CheckForPrime {

    static boolean checkForPrimeBrute(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    static boolean checkForPrimeBetter(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    static boolean checkForPrimeOptimized(int n) {
        // Using getting divisors logic for optmized
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int quo = n / i;
                if (i < quo) {
                    count++;
                } else if (i == quo) {
                    count++;
                }
            }
        }
        return !(count > 2);
    }

    public static void main(String[] args) {
        System.out.println(checkForPrimeOptimized(24));
    }
}
