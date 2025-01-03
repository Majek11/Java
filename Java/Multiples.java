import java.util.Scanner;

public class Multiples {
  public static void main(String[] args) {
    
    Scanner userInput = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int firstNumber = userInput.nextInt();
    
    System.out.print("Enter the second number: ");
    int secondNumber = userInput.nextInt();
    
    int firstNumberTripled = firstNumber * firstNumber * firstNumber;
    
    int secondNumberDoubled = secondNumber * secondNumber;
    
    int remainder = ( firstNumberTripled % secondNumberDoubled ) ;
    
    if ( remainder <= 0 ) {
      System.out.print("First number tripled is a multiple of second number doubled");
    }
    
    if ( remainder > 0 ) {
      System.out.print("First number tripled is not a multiple of second number doubled");
    } 
  }
}
