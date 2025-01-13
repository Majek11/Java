import java.util.Scanner;
import java.util.ArrayList;

public class While {

  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  ArrayList<Integer> array = new ArrayList<>();
  System.out.println("Numbers");
  
  for ( int count = 0; count < array.length; count++ ) {
    array.add(input.nextInt());
  }
    System.out.println(array);
  }

}
