import java.util.Scanner;

public class DiameterCircumferenceArea {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = userInput.nextDouble();
        
        double diameter = 2 * radius;
        
        double pi = Math.PI;
        
        double circumference = 2 * pi * radius;
        
        double area = pi * radius * radius;
        
        System.out.printf("Diameter of the circle is: %.2f%n", diameter);
        System.out.printf("Circumference of the circle is: %.2f%n", circumference);
        System.out.printf("Area of the circle is: %.2f%n", area);
    }
}

