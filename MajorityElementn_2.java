import java.util.Arrays;

public class MajorityElementn_2 {

    static int majorityElement(int arr[]) {
        if (arr.length == 1) {
            // len => 1, n/2 or 1/2 => 0
            return arr[0];
        }
        Arrays.sort(arr);
        int count = 1;
        int threshold = arr.length / 2;
        for (int i = 1; i < arr.length; i++) {
            // System.out.println(count);
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > threshold) {
                    return arr[i - 1];
                }
                count = 1;
            }
        }
        if (count > threshold) {
            return arr[arr.length - 1];
        }
        return -1;
    }

    public static int majorityElementOpt(int arr[]) {
        // Logic assumes that an element with count more than n/2 is present in all
        // cases.
        if (arr.length <= 2) {
            return arr[0];
        }
        int count = 1;
        int max = 1;
        int secondBestMax = 0;
        int secondBestElement = 0;
        int elementWithMostCountStreak = arr[0];
        int fElement = arr[0];
        int countFElement = 1;
        int threshold = arr.length / 2;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == fElement) {
                countFElement++;
            }
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > max) {
                    secondBestElement = elementWithMostCountStreak;
                    secondBestMax = max;

                    elementWithMostCountStreak = arr[i - 1];
                    max = count;
                } else if (count > secondBestMax) {
                    secondBestMax = count;
                    secondBestElement = arr[i - 1];
                }
                count = 1;
            }
        }

        if (count > max) {
            secondBestElement = elementWithMostCountStreak;
            secondBestMax = max;

            elementWithMostCountStreak = arr[arr.length - 1];
            max = count;
        }
        // check count of both elements in array as they both have probability to have
        // count more than n/2
        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementWithMostCountStreak) {
                a++;
            }
            if (arr[i] == secondBestElement) {
                b++;
            }
        }
        if (a > threshold) {
            return a;
        }
        if (b > threshold) {
            return b;
        }
        // System.out.println(elementWithMostCountStreak + " " + secondBestElement + " "
        // + max + " " + secondBestMax);
        if (countFElement > threshold) {
            return fElement;
        }
        if (max > secondBestMax) {
            return elementWithMostCountStreak;
        }
        return -1;

    }

    public static int majorityElementMooreAlgo(int arr[]) {
        int element = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                element = arr[i];
                count = 1;
            } else {
                if (arr[i] == element) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        int countOfElement = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == element) {
                countOfElement++;
            }
        }

        if(countOfElement > (arr.length/2)) {
            return element;
        }

        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        // int arr[] = { 6, 5, 5 };
        int arr[] = { 2, 2, 1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6 };
        System.out.println(majorityElementMooreAlgo(arr));
    }

}
// 2 2 1