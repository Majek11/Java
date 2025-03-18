public class MinAndMax {
    public static void main(String[] args) {
        int[] firstArray = {2, 3, 8, 7, 9};
        int[] secondArray = {1, 4, 8, 7, 5};

        int[] result = findMinimumAndMaximum(firstArray);
        int[] result2 = findMinimumAndMaximum(secondArray);

        System.out.print("Array 1: [ ");
        System.out.printf("%d", result[0] , result[1]);
        //System.out.printf("Minimum : %d%n", result[1]);
        System.out.print(" ]");

        System.out.println("Array 2:");
        System.out.printf("Maximum : %d%n", result2[0]);
        System.out.printf("Minimum : %d%n", result2[1]);
    }

    public static int[] findMinimumAndMaximum(int[] firstArray) {
        int maximum = firstArray[0];
        int minimum = firstArray[0];

        for (int i = 1; i < firstArray.length; i++) {
            if (firstArray[i] > maximum) {
                maximum = firstArray[i];
            } else if (firstArray[i] < minimum) {
                minimum = firstArray[i];
            }
        }

        int[] result = new int[2];
        result[0] = maximum;
        result[1] = minimum;
        return result;
    }
}


