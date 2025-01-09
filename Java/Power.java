import java.util.Scanner;

public class Power {

  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter first number: ");
  int base = userInput.nextInt();
  
  System.out.print("Enter second number: ");
  int exponential = userInput.nextInt();
  
  int count = 1;
  
  for ( int i = 1; i <= exponential ; i++ ) {
    count = count * base;
  }
  
  System.out.printf("Power: %d%n", count);
  
  }
}
