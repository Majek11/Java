import java.util.Scanner;

public class Acceleration {
  public static void main(String[] args) {
    
    Scanner userInput = new Scanner(System.in);
    
    System.out.print("Enter the starting velocity in m/s: ");
    double startingVelocity = userInput.nextDouble();
    
    System.out.print("Enter the ending velocity in m/s: ");
    double endingVelocity = userInput.nextDouble();
  
    System.out.print("Enter the time span in seconds: ");
    double timeValue = userInput.nextDouble();
    
    double averageAcceleration = ( endingVelocity - startingVelocity ) / timeValue;
    
    System.out.printf("Average Acceleration is: %f%n", averageAcceleration);
  
  }
}
