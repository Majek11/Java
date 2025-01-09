import java.util.Scanner;

public class SquarePing {
  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter a number in square meter: ");
  double numberInSquare = userInput.nextDouble();
  
  double pingValue = 0.3025;
  
  double ping = numberInSquare * pingValue;
  
  System.out.printf("Ping value: %.3f%n", ping);
  }
}
