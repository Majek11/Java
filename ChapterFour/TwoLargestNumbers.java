import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int number;
        
        System.out.print("Enter number 1: ");
        largest = input.nextInt();
        
        while (counter < 10) {
            counter++;
            System.out.printf("Enter number %d: ", counter);
            number = input.nextInt();
            
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        
        System.out.printf("The largest number is: %d%n", largest);
        System.out.printf("The second largest number is: %d%n", secondLargest);
    }
}
