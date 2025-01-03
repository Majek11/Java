import java.util.Scanner;

public class Interest {
  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter balance: ");
  double balance = userInput.nextDouble();
  
  System.out.print("Enter interest: ");
  double interest = userInput.nextDouble();
  
  double interestTotal = balance * (interest / 1200);
  
  System.out.printf("The interest is: %f%n", interestTotal);
  }
}
