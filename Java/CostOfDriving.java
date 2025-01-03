import java.util.Scanner;

public class CostOfDriving {

  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter driving distance: ");
  double driveDistance = userInput.nextDouble();
  
  System.out.print("Enter miles per gallon: ");
  double milesPerGallon = userInput.nextDouble();
  
  System.out.print("Enter price per gallon: ");
  double pricePerGallon = userInput.nextDouble();
  
  double CostOfDriving = (driveDistance * pricePerGallon) / milesPerGallon;
  
  System.out.print("The cost of driving: " + CostOfDriving + "\n");
  System.out.println("The cost of driving: " + CostOfDriving);
  System.out.printf("The cost of driving: %.2f%n", CostOfDriving);
  }
}

// Run it and loop it five times
