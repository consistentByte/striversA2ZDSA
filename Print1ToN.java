public class Print1ToN {
    //Parameterized recursion
    public static void print1ToN(int n, int count) {
        if (count > n) {
            return;
        }
        System.out.println(count);
        print1ToN(n, count + 1);
    }


    //Functional Recursion
    /*
     * Backtracking means starting from back,
     * doing task after the function call,
     * Make sure last task executed first.
     * So not doing i+1, instead using diff approach of i-1
     */

    public static void print1ToNUsingBackTrack(int n) {

        if (n == 0) {
            return;
        }
        print1ToNUsingBackTrack(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print1ToNUsingBackTrack(5);
    }
}
