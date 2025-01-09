import java.util.Scanner;

public class LargestSmallest {
  public static void main(String[] args) {

  Scanner userInput = new Scanner(System.in);
  
  System.out.print("Enter first integer: ");
  int firstInt = userInput.nextInt();
  
  System.out.print("Enter second integer: ");
  int secondInt = userInput.nextInt();
  
  System.out.print("Enter third integer: ");
  int thirdInt = userInput.nextInt();
  
  System.out.print("Enter fourth integer: ");
  int fourthInt = userInput.nextInt();
  
  System.out.print("Enter fifth integer: ");
  int fifthInt = userInput.nextInt();
  
  int  smallest = firstInt;
  
  if ( firstInt <= secondInt && firstInt <= thirdInt && firstInt <= fourthInt && firstInt <= fifthInt ) {
   smallest = firstInt;
   }
   
   if ( secondInt <= firstInt && secondInt <= thirdInt && secondInt <= fourthInt && secondInt <= fifthInt ) {
    smallest = secondInt;
  }
  
   if ( thirdInt <= firstInt && thirdInt <= secondInt && thirdInt <= fourthInt && thirdInt <= fifthInt ) {
    smallest = thirdInt;
  }
  
  if ( fourthInt <= firstInt && fourthInt <= secondInt && fourthInt <= thirdInt && fourthInt <= fifthInt ) {
    smallest = fourthInt;
  }
  
  if ( fifthInt <= firstInt && fifthInt <= secondInt && fifthInt <= thirdInt && fifthInt <= fourthInt ) {
    smallest = fifthInt;
  }
  
  int largest = firstInt;
  
   if ( firstInt >= secondInt && firstInt >= thirdInt && firstInt >= fourthInt && firstInt >= fifthInt ) {
   largest = firstInt;
   }
   
    if ( secondInt >= firstInt && secondInt >= thirdInt && secondInt >= fourthInt && secondInt >= fifthInt ) {
    largest = secondInt;
  }
  
   if ( thirdInt >= firstInt && thirdInt >= secondInt && thirdInt >= fourthInt && thirdInt >= fifthInt ) {
    largest = thirdInt;
  }
  
  if ( thirdInt >= firstInt && thirdInt >= secondInt && thirdInt >= fourthInt && thirdInt >= fifthInt ) {
    largest = fourthInt;
  }
  
   if ( thirdInt >= firstInt && thirdInt >= secondInt && thirdInt >= fourthInt && thirdInt >= fifthInt ) {
    largest = fifthInt;
  }
  
  
  
  System.out.printf("Smallest number is: %d%n", smallest);
}
}
