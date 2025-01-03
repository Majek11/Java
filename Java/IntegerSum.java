import java.util.Scanner;

public class IntegerSum {
  public static void main(String[] args) {
  
  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter a number between 0 to 1000: ");
  
  int number = userInput.nextInt();
  
  int extract1 = number % 10;
  
  number /= 10;
  
  int extract2 = number % 10;
  
  number /= 10;
  
  int extract3 = number % 10;
  
  number /= 10;
  
  int totalNumber = extract1 + extract2 + extract3;
  
  System.out.printf("Total Number is : %d%n", totalNumber);
  
  }
  }
