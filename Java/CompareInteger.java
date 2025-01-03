import java.util.Scanner;

public class CompareInteger {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter number to compare: ");
        double userNumber = userInput.nextDouble();
        
        double squaredNumber = userNumber * userNumber;

        System.out.println("\nComparison for the number:");
        if (userNumber > 100) {
        System.out.printf("The number %.2f is greater than 100.%n", userNumber);
        }
        if (userNumber < 100) {
        System.out.printf("The number %.2f is less than 100.%n", userNumber);
        }
        if (userNumber == 100) {
        System.out.printf("The number %.2f is equal to 100.%n", userNumber);
        }

        System.out.println("\nComparison for the square:");
        if (squaredNumber > 100) {
        System.out.printf("The square %.2f is greater than 100.%n", squaredNumber);
        }
        if (squaredNumber < 100) {
        System.out.printf("The square %.2f is less than 100.%n", squaredNumber);
        }
        if (squaredNumber == 100) {
        System.out.printf("The square %.2f is equal to 100.%n", squaredNumber);
        }
    }
}

