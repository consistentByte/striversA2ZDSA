public class printNto1 {
    public static void printNTo1_(int n, int count) {
        if (count > n) {
            return;
        }
        printNTo1_(n, count + 1);
        System.out.println(count);
    }

    public static void printNTo1(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);

    }

    public static void main(String[] args) {
        printNTo1(5);
    }
}
