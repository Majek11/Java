import java.util.Scanner;

public class BodyMassIndex {
  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter weight in pounds: ");
  double weight = userInput.nextDouble();
  
  System.out.print("Enter height in inches: ");
  double height = userInput.nextDouble();
  
  double poundConstant = weight * 0.45359237;
  
  double heightConstant = height * 0.0254;
  
  double bmiFormula = (poundConstant / (Math.pow(heightConstant, 2)));
  
  System.out.printf("BMI is : %.3f%n", bmiFormula);
  }
}
