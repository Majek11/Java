import java.util.Scanner;

public class TwoLargestValues {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        int largest = 0;
        int secondLargest = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Enter number %d: ", i);
            int inputCollector = userInput.nextInt();

            if (inputCollector > largest) {
                secondLargest = largest;
                largest = inputCollector;
            } else if (inputCollector > secondLargest) {
                secondLargest = inputCollector;
            }
        }
        
        System.out.printf("The largest number is: %d%n", largest);
        System.out.printf("The second largest number is: %d%n", secondLargest);
    }
}

