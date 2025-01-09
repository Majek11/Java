import java.util.Scanner;

public class Divisibility {

  public static void main(String args[]) {
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter number to check: ");
  int number = input.nextInt();
  
  if ( number % 5 == 0 && number % 3 == 0 ) {
    System.out.println("FizzBuzz");
  } else if ( number % 5 == 0 ) {
    System.out.println("Fizz");
  } else if ( number % 3 == 0 ) {
    System.out.println("Buzz");
  } else {
    System.out.println("Woo");
  }

  
  
  }
}
