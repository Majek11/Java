import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter five numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Enter number %d: ", i);
            int number = userInput.nextInt();
            
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.printf("Number of positive numbers: %d%n", positiveCount);
        System.out.printf("Number of negative numbers: %d%n", negativeCount);
        System.out.printf("Number of zeros: %d%n", zeroCount);

    }
}

