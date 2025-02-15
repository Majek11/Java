import java.util.Scanner;

public class AtmWithdrawalSystem {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  final int BALANCE = 50000;
  int amount;
  String name;
  
  while (true) {
    System.out.println("What is your name? ");
    name = input.nextLine();
    System.out.println("Available Balance for " + name + " is " + BALANCE);
    System.out.print("Enter amount to withdraw: ");
    amount = input.nextInt();
    
    if ( amount > BALANCE ) {
      System.out.println("Insufficient Funds");
    } else {
      System.out.println("Withdrawal Successful");
      break;
    }
  }
  
  }
}
