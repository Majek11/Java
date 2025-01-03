import java.util.Scanner;

public class CirclePerimeter {
  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter radius of the circle: ");
  double circleRadius = userInput.nextDouble();
  
  double pi = 3.14159;
  
  double perimeter = 2 * circleRadius * pi;
  
  double area = circleRadius * circleRadius * pi;
  
  System.out.printf("Perimeter is : %.2f%n", perimeter);
  System.out.printf("Area is : %.2f%n", area);
  
  }

}
