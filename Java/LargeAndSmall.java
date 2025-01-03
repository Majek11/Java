import java.util.Scanner;

public class LargeAndSmall {
  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  s
  System.out.print("Enter number 1: "); 
  int largest = userInput.nextInt();
  int smallest = largest;
  
  int count = 2;
  
  while ( count <= 5 ) {
  System.out.printf("Enter number %d: ", count );
  int inputCollector = userInput.nextInt();
  if ( largest < inputCollector ) largest = inputCollector;
  if ( smallest > inputCollector ) smallest = inputCollector;
  count++;
  }
  System.out.printf("Largest is: %d%n", largest);
  System.out.printf("Smallest is: %d%n", smallest);
  }
  
}
