import java.util.Scanner;

public class CreditLimitCalculator {

  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.println("=== CREDIT LIMIT CALCULATOR ===");
  
  System.out.println("Enter account number: ");
  int accountNumber = input.nextInt();
  
  System.out.println("Enter balance at the beginning of the month: ");
  int balanceAtTheBeginningOfTheMonth = input.nextInt();
  
  System.out.println("Enter total items charged by this customer this month: ");
  int totalItemsCharged = input.nextInt();
  
  System.out.println("Enter the total of all credits applied to the customer’s account this month");
  int totalCreditApplied = input.nextInt();
  
  System.out.println("Enter allowed credit limit: ");
  int allowedCreditLimit = input.nextInt();
  
  int newBalance = balanceAtTheBeginningOfTheMonth + totalItemsCharged - totalCreditApplied;
  System.out.println("New Balance: " + newBalance);
  
  if ( newBalance > allowedCreditLimit ) {
    System.out.println("Credit Limit Exceeded");
  }
  
  }
}
