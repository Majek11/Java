import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = userInput.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("The number must be a three-digit integer");
        } else {
        
            int firstDigit = number / 100;    
            int lastDigit = number % 10;      

            if (firstDigit == lastDigit) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }
    }
}

