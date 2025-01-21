import java.util.Scanner;

public class InitArray2 {

  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  int number1 = input.nextInt();
  
  int ARRAY_LENGTH = number1;
  int[] number = new int[ARRAY_LENGTH];
  
  System.out.printf("%s%8s%n", "Index", "Value");
  
  for ( int counter = 0; counter < number.length; counter++ ) {
    number[counter] = 2 + ( 2 * counter );
    System.out.printf("%6d%8d%n", counter, number[counter]);
  }
  }
}
