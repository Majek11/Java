import java.util.Scanner;

public class Feet {
  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter a value for feet: ");
  double feetValue = userInput.nextDouble();
  
  double meter = 0.305 * feetValue;  
  
  System.out.printf("Feet in meters is: %f%n", meter); 
  }
}


