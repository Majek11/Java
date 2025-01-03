import java.util.Scanner;

public class Large {

  public static void main(String args[]) {
  
  Scanner input = new Scanner(System.in);
  
  System.out.println("Input the first number:");
  int firstNumber = input.nextInt();
  
  System.out.println("Input the second number:");
  int secondNumber = input.nextInt();
  
  if (  firstNumber > secondNumber ) {
    System.out.println("First Number is the Largest");
  } else if ( firstNumber < secondNumber )
  {
    System.out.println("Second Number is the Largest");
  } else {
    System.out.println("Both numbers are equal");
  }
  }
}
