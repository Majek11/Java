import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the length of the base of the triangle (1 to 10): ");
        int baseLength = userInput.nextInt();

        if (baseLength < 1 || baseLength > 10) {
            System.out.println("Invalid input! Please enter a number between 1 and 10.");
        } else {
            System.out.println("Here is your triangle:");
            for (int i = 1; i <= baseLength; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

