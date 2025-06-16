package striversA2ZDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllDivisors {

    static ArrayList<Integer> printAllDivisorsBrute(int n) {
        ArrayList<Integer> ls = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ls.add(i);
            }
        }

        return ls;
    }

    static ArrayList<Integer> printAllDivisorsOptimized(int n) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int quo = n / i;
                if (i < quo) {
                    ls.add(i);
                    ls.add(quo);
                } else if (i == quo) {
                    ls.add(i);
                } else {
                    // i > quo
                    break;
                }
            }
        }
        ls.sort(null);
        return ls;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ls = printAllDivisorsOptimized(36);
        System.out.println(ls.toString());
    }

}
