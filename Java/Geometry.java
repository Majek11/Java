import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter three points for a triangle (x1 y1 x2 y2 x3 y3): ");
        double x1 = userInput.nextDouble();
        double y1 = userInput.nextDouble();
        double x2 = userInput.nextDouble();
        double y2 = userInput.nextDouble();
        double x3 = userInput.nextDouble();
        double y3 = userInput.nextDouble();

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double semiPerimeter = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

        System.out.printf("The area of the triangle is %.1f%n", area);
    }
}

