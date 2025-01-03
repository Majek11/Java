import java.util.Scanner;

public class DoWhileAdd {

  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter first number: ");
  int firstNumber = userInput.nextInt();
  
  System.out.print("Enter second number: ");
  int secondNumber = userInput.nextInt();
  
  do { 
    int sum = firstNumber + secondNumber;
    System.out.printf("Sum of the number is: %f%n", sum);
    
    System.out.print("Do you want to perform the operation again? (Yes / No)");
    repeatOperation = userInput.next();
  } while (
    repeatOperation == "Yes"
  );
  
  }
}
