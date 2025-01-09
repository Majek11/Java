import java.util.Arrays;

public class ArrayFunctions {

    public static int largestElement(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int[] reverseList(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - i - 1];
        }
        return reversed;
    }

    public static boolean elementExists(int[] arr, int element) {
        for (int num : arr) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }

    public static void printOddPositions(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int[] getEvenPositions(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i += 2) count++;

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i += 2) {
            result[index++] = arr[i];
        }
        return result;
    }

    public static int[] runningTotal(int[] arr) {
        int[] totals = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            totals[i] = sum;
        }
        return totals;
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int[] concatenateLists(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {6, 7, 8, 9, 10};

        System.out.println("Largest Element: " + largestElement(list1));

        System.out.println("Reversed List: " + Arrays.toString(reverseList(list1)));

        System.out.println("Does 3 exist in the list? " + elementExists(list1, 3));

        System.out.print("Elements on Odd Positions: ");
        printOddPositions(list1);

        System.out.println("Elements on Even Positions: " + Arrays.toString(getEvenPositions(list1)));

        System.out.println("Running Total: " + Arrays.toString(runningTotal(list1)));

        System.out.println("Is 'madam' a Palindrome? " + isPalindrome("madam"));

        System.out.println("Concatenated Lists: " + Arrays.toString(concatenateLists(list1, list2)));
    }
}

