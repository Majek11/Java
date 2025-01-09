import java.util.Scanner;

public class Temperature {

  public static void main(String args[]) {
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter temperature: ");
  int temp = input.nextInt();
  
  if ( temp > 30 ){
    System.out.println("Hot");
  } else if ( temp >= 20 && temp <= 30 ) {
    System.out.println("Warm");
  } else if ( temp < 20) {
    System.out.println("Cold");
  }
  }
}
