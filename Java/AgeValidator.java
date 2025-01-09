import java.util.Scanner;

public class AgeValidator {
  
  public static void main(String args[]) {
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter age to vote: ");
  int voteAge = input.nextInt();
  
  System.out.print("Enter age to drive: ");
  int driveAge = input.nextInt();
 
  if ( voteAge < 18 ) {
    System.out.println("You are not eligible to vote.");
  } else {
    System.out.println("You are eligible to vote.");
  }
  
  if ( driveAge < 16 ) {
    System.out.println("You are not eligible to drive.");
  } else {
    System.out.println("You are eligible to drive.");  
  }
  
  }
}
