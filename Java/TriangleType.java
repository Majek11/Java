import java.util.Scanner;

public class TriangleType {

  public static void main(String args[]) {
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter the first side: ");
  int firstSide = input.nextInt();
  
  System.out.print("Enter the second side: ");
  int secondSide = input.nextInt();
  
  System.out.print("Enter the third side: ");
  int thirdSide = input.nextInt();
  
  if ( firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide)
    System.out.println("Valid triangle sides");
    else 
    System.out.println("Invalid triangle sides");
  
  if ( firstSide == secondSide && firstSide == thirdSide )
    System.out.println("This is an equilateral triangle");
    else 
  if ( firstSide == secondSide || secondSide == thirdSide || firstSide ==thirdSide )
    System.out.println("This is an isosceles triangle");
    else 
    System.out.println("This is a scalene triangle");
  } 
}
