import java.util.Scanner;

public class NumberSearch {
  
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  // Prompt user for the number of elements
  System.out.print("How many numbers do you want to type: ");
  int size = input.nextInt();
  
  // initialize the array
  int[] numbers = new int[size];
  
  // Prompt user to enter numbers
  System.out.println("Enter " + size + " number(s)");
  for ( int i = 0; i < size; i++ ) {
    System.out.print("Number " + (i + 1) + ": ");
    numbers[i] = input.nextInt();
  }
  
  int left = 0;
  int right = numbers.length - 1;
  int target = numbers[0];
  
  while ( left <= right ) {
    int mid = (left + right) / 2;
      if ( numbers[mid] == target ) {
        return mid;
      } else if (numbers[mid] < target ) {
        left = mid - 1;
      } else 
        right = mid - 1;
  }
  
  }
}
