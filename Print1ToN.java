public class Print1ToN {
    public static void print1ToN(int n, int count) {
        if (count > n) {
            return;
        }
        System.out.println(count);
        print1ToN(n, count + 1);
    }

    /*
     * Backtracking means starting from back,
     * doing task after the function call,
     * Make sure last task executed first.
     * So not doing i+1, instead using diff approach of i-1
     */

    public static void print1ToNUsingBackTrack(int n, int i) {

        if (i < 1) {
            return;
        }
        print1ToNUsingBackTrack(n, i - 1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        print1ToNUsingBackTrack(5, 5);
    }
}
