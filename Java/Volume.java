import java.util.Scanner;

public class Volume {
  public static void main(String[] args) {
  
  Scanner compute = new Scanner(System.in);
  
  System.out.print("Enter the length of the triangle: ");
  double lengthOfSides = compute.nextDouble();
  
  System.out.print("Enter the power of z: ");
  double z = compute.nextDouble();
  
  double area = ( Math.sqrt(3) / 4 )* Math.pow(lengthOfSides, z);
  
  double volume = area * lengthOfSides;
  
  System.out.printf("The area is: %f%n", area);
  System.out.printf("The volume is: %f%n", volume);
  }
}
