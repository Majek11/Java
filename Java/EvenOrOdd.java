import java.util.Scanner;

public class EvenOrOdd {
  
  public static void main(String args[]) {
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter number:");
  
  int num = input.nextDouble();
  
  if ( num % 2 == 0 ) {
    System.out.println("Number is even");
  } else {
    System.out.println("Number is odd");
  }
  }
}
