import java.util.Scanner;

public class ClassSum {

  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);

  System.out.print("Enter first Number: ");
  int numberOne = userInput.nextInt();
  
  System.out.print("Enter second Number: ");
  int numberTwo = userInput.nextInt();
  
  int sum = numberOne + numberTwo;
  
  switch ( sum ) {
    case 50: System.out.println("Sum is 50");
    break;
    case 100: System.out.println("Sum is 100");
  } 

}
}


