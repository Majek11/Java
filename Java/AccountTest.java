import java.util.Scanner;

public class AccountTest {

  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  Account myAccount1 = new Account("Jane Green", 50.00);
  Account myAccount2 = new Account("John Blue", -7.53);
  
  System.out.printf("%s balance: %f%n", myAccount1.getBalance());
  System.out.printf("%s balance: %f%n", myAccount2.getBalance());
  
  System.out.printf("Initial name is %s%n%n", myAccount1.getName());
  System.out.printf("Initial name is %s%n%n", myAccount2.getName());
  
  System.out.print("Enter deposit amount for account1: "); // prompt
  double depositAmount = input.nextDouble(); // obtain user input
  
  System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);

  account1.deposit(depositAmount); // add to account1’s balance
  // display balances
  System.out.printf("%s balance: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
  System.out.printf("%s balance: $%.2f%n%n",myAccount2.getName(), myAccount2.getBalance());
  System.out.print("Enter deposit amount for account2: "); // prompt
  
  depositAmount = input.nextDouble(); // obtain user input
  System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
  myAccount2.deposit(depositAmount); // add to account2 balance

  // display balances
  System.out.printf("%s balance: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
  System.out.printf("%s balance: $%.2f%n%n", myAccount2.getName(), myAccount2.getBalance());
  
  System.out.println("Please enter your name: ");
  String theName = input.nextLine(); // read a line of text
  myAccount1.setName(theName); // put theName in myAccount
  System.out.println(); // outputs a blank line
  
  System.out.printf("Name in object myAccount is: %n%s%n", myAccount1.getName());
  System.out.printf("Name in object myAccount is: %n%s%n", myAccount2.getName());
  }

}
