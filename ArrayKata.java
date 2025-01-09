public class ArrayKata {

    public static int maximumIn(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int minimumIn(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int sumOf(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int sumOfEvenNumbersIn(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int sumOfOddNumbersIn(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int[] maximumAndMinimumOf(int[] array) {
        int[] result = new int[2];
        result[0] = maximumIn(array);
        result[1] = minimumIn(array);  
        return result;
    }

    public static int noOfOddNumbersIn(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int noOfEvenNumbersIn(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] evenNumbersIn(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbers = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers[index++] = num;
            }
        }
        return evenNumbers;
    }

    public static int[] oddNumbersIn(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }

        int[] oddNumbers = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                oddNumbers[index++] = num;
            }
        }
        return oddNumbers;
    }

    public static int[] squareNumbersIn(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPerfectSquare(num)) {
                count++;
            }
        }

        int[] squareNumbers = new int[count];
        int index = 0;
        for (int num : array) {
            if (isPerfectSquare(num)) {
                squareNumbers[index++] = num;
            }
        }
        return squareNumbers;
    }

    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        int[] array = {4, 7, 9, 16, 25, 36, 2, 3, 1, 0};
        
        System.out.println("Maximum: " + maximumIn(array));
        System.out.println("Minimum: " + minimumIn(array));
        System.out.println("Sum: " + sumOf(array));
        System.out.println("Sum of even numbers: " + sumOfEvenNumbersIn(array));
        System.out.println("Sum of odd numbers: " + sumOfOddNumbersIn(array));
        
        int[] maxMin = maximumAndMinimumOf(array);
        System.out.println("Max and Min: [" + maxMin[0] + ", " + maxMin[1] + "]");
        
        System.out.println("Number of odd numbers: " + noOfOddNumbersIn(array));
        System.out.println("Number of even numbers: " + noOfEvenNumbersIn(array));
        
        System.out.print("Even numbers: ");
        for (int num : evenNumbersIn(array)) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int num : oddNumbersIn(array)) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("Square numbers: ");
        for (int num : squareNumbersIn(array)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

