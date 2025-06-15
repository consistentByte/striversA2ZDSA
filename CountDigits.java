package striversA2ZDSA;

public class CountDigits {

    public static int countDigits(int n) {
        int value = n;
        int count = 0;
        while (true) {
            value = value / 10;
            count++;
            if (value == 0) {
                return count;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(countDigits(234));
    }
}
