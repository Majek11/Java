import java.util.Scanner;

public class LargeAndSmallNew {
    public static void main(String[] args) {

      Scanner userInput = new Scanner(System.in);

      System.out.print("How many numbers do you want to input: ");
      int numbersOfInput = userInput.nextInt();

      System.out.println("Enter the numbers: ");
      int largest = 0;
      int smallest = numbersOfInput;
      
      for ( int i = 0; i < numbersOfInput; i++ ) {
      int numberCollector = userInput.nextInt();
        if ( numberCollector > largest ) {
          largest = numberCollector;
        } 
        if ( numberCollector < smallest ) {
          smallest = numberCollector;
        }
      }

    System.out.printf("Largest is: %d%n", largest);
    System.out.printf("Smallest is: %d%n", smallest);
  }
}


      //while (count > 4) { 
      //System.out.printf("Enter number %d: ", count);
      //int inputCollector = userInput.nextInt();

      //if (inputCollector < largest) largest = inputCollector; 

      //if (inputCollector > smallest) smallest = inputCollector;

      //count++;
      //}



