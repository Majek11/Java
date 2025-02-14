import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
 
 Scanner input = new Scanner(System.in);
 String username;
 
 do {
  System.out.println("Enter your username: ");
  username = input.nextLine();
 } while (!username.equals("Alice"));
  System.out.println("Correct");
  
  }  
}
