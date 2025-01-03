import java.util.Scanner;

public class FinanceApp {
  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter investment amount: ");
  double investmentAmount = userInput.nextDouble();
  
  System.out.print("Enter annual interest rate in percentage: ");
  double annualInterest = userInput.nextDouble();
  
  System.out.print("Enter number of years: ");
  double years = userInput.nextDouble();
  
  double futureInvestementValue = investmentAmount * Math.pow((1 + annualInterest / 100 / 12 ), 12 * years);

  System.out.printf("Value is: #%.2f%n", futureInvestementValue);
 
  }
}
