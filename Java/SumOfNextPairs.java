public class SumOfNextPairs {
    public static void main(String[] args) {
        System.out.println("Final sum of powers of 4 and 8:");

        int sumOfPowersOfFour = 0;
        int sumOfPowersOfEight = 0;

        int result = 4;
        for (int i = 0; i < 5; i++) {
            sumOfPowersOfFour += result;
            result *= 4;
        }
        
        result = 8;
        for (int i = 0; i < 5; i++) {
            sumOfPowersOfEight += result;
            result *= 8;
        }
        
        int sumOfBothPairs = sumOfPowersOfFour + sumOfPowersOfEight;

        System.out.printf("Sum of powers of 4: %d%n", sumOfBothPairs);
    }
}

