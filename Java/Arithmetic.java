import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstInteger = userInput.nextInt();

        System.out.print("Enter the second integer: ");
        int secondInteger = userInput.nextInt();
        
        int squareOne = firstInteger * firstInteger;
        int squareTwo = secondInteger * secondInteger;

        int sumOfSquares = squareOne + squareTwo;

        int differenceOfSquares = squareOne - squareTwo;

        System.out.println("The square of " + firstInteger + " is: " + squareOne);
        System.out.println("The square of " + secondInteger + " is: " + squareTwo);
        System.out.println("The sum of their squares is: " + sumOfSquares);
        System.out.println("The difference of their squares is: " + differenceOfSquares);
    }
}

