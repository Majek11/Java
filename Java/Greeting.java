import java.util.Scanner;

public class Greeting {
  public static void main(String[] args) {
  
  Scanner reader = new Scanner(System.in);
  
  System.out.print("Enter first Name: ");
  String firstName = reader.nextLine();
  
  System.out.print("Enter last Name: ");
  String lastName = reader.nextLine();
  
  System.out.printf("Good evening %s %s%n", firstName ,  lastName );
  
  }
}
