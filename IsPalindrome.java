public class IsPalindrome {

    public static String reverseString(String str) {
        if (str == "") {
            return "";
        }
        String reversedSmallString = reverseString(str.substring(1));
        reversedSmallString = reversedSmallString + str.charAt(0);
        return reversedSmallString;
    }

    public static boolean isPalindrome(String str) {
        String reversedString = reverseString((str));

        return str.equals(reversedString);
    }

    /*
     * Functional Recursion
     * abba => comparing indexed 0, 1, 2, 3 to index 3,2,1,0
     * comparisons = (0,3), (1,2), (2,1), (3, 0)
     * only going until half of array as after that comparison repeats.
     * TC => sqrt(str.length)
     */
    public static boolean isPalindromeBetter_(String str, int i) {
        int a = i;
        int b = (str.length() - 1) - i;

        if (a >= b) {
            return true;
        }
        boolean result = isPalindromeBetter_(str, i + 1);
        if (result && (str.charAt(a) == str.charAt(b))) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isPalindromeBetter(String str) {
        return isPalindromeBetter_(str, 0);
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeBetter("vv"));
    }
}
