import java.util.Scanner;

public class MultipicationTable {
  
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter any number to print the multiplication table: ");
  int userNumber = input.nextInt();
  
  for ( int i = 1; i <= 12; i++ ) {
    System.out.println(userNumber + " * " + i + " = "  + (userNumber * i));
  }
  }
}


