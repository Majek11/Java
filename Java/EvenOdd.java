import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int numberOfIntegers = userInput.nextInt();
        
        int sumOfEven = 0;
        int sumOfOdd = 0;

        
        System.out.println("Enter the   integers :");
        for (int i = 0; i < numberOfIntegers; i++) {
            int integerCollector = userInput.nextInt();
            if ( integerCollector % 2 == 0) {
                sumOfEven += integerCollector;
            } else {
                sumOfOdd += integerCollector;
            }
        }

        System.out.printf("Sum of even integers: %d%n", sumOfEven);
        System.out.printf("Sum of odd integers: %d%n", sumOfOdd);
    }
}

