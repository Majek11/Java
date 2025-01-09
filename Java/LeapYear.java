import java.util.Scanner;

public class LeapYear {

  public static void main(String args[]) {
  
  Scanner inputCollector = new Scanner(System.in);
  
  System.out.print("Input Year: ");
  
  int year = inputCollector.nextInt();
  
  if (( year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0 )) {
    System.out.println("This is a Leap year");
  } else {
    System.out.println("This is not a Leap year");
  }
  
  }
}
