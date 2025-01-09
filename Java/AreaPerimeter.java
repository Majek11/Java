import java.util.Scanner;

public class AreaPerimeter {
	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Enter the width of triangle: ");
	double width = userInput.nextDouble();
	
	System.out.print("Enter the height of triangle: ");
	double height = userInput.nextDouble();
	
	double area = width * height;
	
	double perimeter = 2 * (width + height);
	
	System.out.printf("Area is: %.1f%n", area);
	System.out.printf("Perimeter is: %.1f%n", perimeter);
	}
}
