package striversA2ZDSA;
public class Patterns {

    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - (i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            // s -> Spaces, v -> values
            for (int s = 1; s <= (n - i); s++) {
                System.out.print("  ");
            }

            for (int v = 1; v <= ((2 * i) - 1); v++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            // s -> Spaces, v -> values
            for (int s = 1; s <= (i - 1); s++) {
                System.out.print("  ");
            }

            for (int v = 1; v <= ((2 * (n - i)) + 1); v++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            // upper half iteration
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            // lower half iteration
            for (int b = 1; b <= ((n - 1) - (i - 1)); b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(((i - j) + 1) + " ");
            }

            System.out.println();
        }
    }

    public static void pattern9(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++, value++) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            char value = 'A';
            for (int j = 1; j <= i; j++, value++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            char value = 'A';
            for (int j = 1; j <= (n - (i - 1)); j++, value++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        char value = 'A';
        for (int i = 1; i <= n; i++, value++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            char value = 'A';
            for (int j = 1; j <= i; j++, value++) {
                System.out.print(value + " ");
            }
            value = (char) ('A' + (i - 2));
            for (int j = 1; j <= (i - 1); j++, value--) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            char value = (char) ('A' + ((n - (i - 1)) - 1));

            for (int j = 1; j <= i; j++, value++) {
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - (i - 1)); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (i - 1)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (n - (i - 1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        for (int i = 1; i <= (n - 1); i++) {
            if (i != 1 && i != n - 1) {
                System.out.print("*");
                for (int j = 1; j <= ((n - 1) - 2); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                for (int j = 1; j <= (n - 1); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void pattern17(int n) {
        for (int i = 1; i <= (n - 1); i++) {
            int value = (n - 1);
            int j = 1;
            for (j = 1; j < i; j++, value--) {
                System.out.print(value);
            }
            for (int k = 1; k <= ((2 * (n - i)) - 1); j++, k++) {
                System.out.print(value);
            }
            value++;
            for (; j <= ((2 * (n - 1)) - 1); j++) {
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
        for (int i = (n - 2); i >= 1; i--) {
            int value = (n - 1);
            int j = 1;
            for (j = 1; j < i; j++, value--) {
                System.out.print(value);
            }
            for (int k = 1; k <= ((2 * (n - i)) - 1); j++, k++) {
                System.out.print(value);
            }
            value++;
            for (; j <= ((2 * (n - 1)) - 1); j++) {
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        pattern17(7);
    }
}
