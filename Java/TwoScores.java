import java.util.Scanner;

public class TwoScores {
  
  public static void main(String[] args) {
  
  Scanner reader = new Scanner(System.in);
  
  System.out.print("Enter first Score: ");
  int firstScore = reader.nextInt();
  
  System.out.print("Enter second Score: ");
  int secondScore = reader.nextInt();
  
  int sum = firstScore + secondScore;
  
  int average = ( firstScore + secondScore ) / 2;
  
  int smallest = firstScore;
  int largest = smallest;
  
  if ( firstScore < secondScore ) {
    firstScore = smallest;
  } 
  
   if ( secondScore > firstScore ) {
    firstScore = largest;
  } 
  
  System.out.printf("Sum of the numbers: %d%n", sum);
  System.out.printf("Average of the numbers: %d%n", average);
  System.out.printf("Smallest number is: %d%n", smallest);
  System.out.printf("Largest number is: %d%n", largest);
  
  }
}
