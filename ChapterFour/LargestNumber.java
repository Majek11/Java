import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int counter = 1;     
        int largest = 0;      
        int number;           
        
        System.out.print("Enter number 1: ");
        largest = input.nextInt();
        
        while (counter < 10) {
            counter++;
            System.out.printf("Enter number %d: ", counter);
            number = input.nextInt();
            
            if (number > largest) {
                largest = number;
            }
        }
        
        System.out.printf("The largest number is: %d%n", largest);
    }
}
