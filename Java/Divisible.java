import java.util.Scanner;

public class Divisible {
  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter the number: ");
  double userNumber = userInput.nextDouble();
  
  double divisibleByThree = userNumber / 3;
  
  double remainder = userNumber % 3;
  
  if ( remainder <= 0 ) {
    System.out.print("Number is divisible by 3 ");
  }
  
  if ( remainder > 0 ) {
    System.out.print("Number is not divisible by 3 ");
  }
  }
}
