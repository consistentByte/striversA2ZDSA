public class Factorial {

    //Functional Recursion
    public static void factorial(int n, int fact) {
        if (n == 1 || n == 0) {
            System.out.println(fact);
            return;
        }
        factorial(n - 1, n*fact);
    }

    public static int factorialBacktrack(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int smallProblemSolvedUsingRec = factorialBacktrack(n - 1);

        return n * smallProblemSolvedUsingRec;
    }

    public static void main(String[] args) {
        // System.out.println(factorialBacktrack(3));
        factorial(4, 1);
    }

}
