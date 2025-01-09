import java.util.Scanner;

public class Password {
  
  public static void main(String args[]) {
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter Password: ");
  String password = input.next();
  
  String prepass = "12345";
  
  if ( !password.equals(prepass) ) {
    System.out.println("Access Denied");
  } else {
    System.out.println("Access Granted");
  }
  
  }
}
