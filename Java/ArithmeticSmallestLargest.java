import java.util.Scanner;

public class ArithmeticSmallestLargest {
  public static void main(String[] args) {

  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter the first number: ");
  double firstNumber = userInput.nextDouble();
  
  System.out.print("Enter the second number: ");
  double secondNumber = userInput.nextDouble();
  
  System.out.print("Enter the third number: ");
  double thirdNumber = userInput.nextDouble();
  
  double sum = firstNumber + secondNumber + thirdNumber;
  
  double average = (firstNumber + secondNumber + thirdNumber) / 3;
  
  double product = firstNumber * secondNumber * thirdNumber;
  
  double smallest = firstNumber;
  
  if ( secondNumber < smallest ) {
    smallest = secondNumber;
  }
  
  if ( thirdNumber < smallest ) {
    smallest = thirdNumber;
  }
  
  double largest = firstNumber;
  
  if ( secondNumber > largest ) {
    largest = secondNumber;
  }
  
  if ( thirdNumber > largest ) {
    largest = thirdNumber;
  }
  
  System.out.printf("Sum is %.1f%n", sum); 
  System.out.printf("Average is %.1f%n", average);
  System.out.printf("Product is %.1f%n", product); 
  System.out.printf("Smallest number is %.1f%n", smallest);
  System.out.printf("Largest number is %.1f%n", largest);
  }
}
