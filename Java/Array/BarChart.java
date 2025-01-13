public class BarChart {
  
  public static void main(String[] args) {
  
  int[] array = {0, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
  
  System.out.println("Grade distribution: ");
  
  for ( int counter = 0; counter < array.length; counter++ ) {
    if ( counter == 10 ) {
      System.out.printf("%d: ", 100);
    } else {
      System.out.printf("%d-%d: ", counter * 10, counter * 10 + 9);
    }
    
  for ( int stars = 0; stars < array[counter]; stars++ ){
    System.out.print("*");
      }
      System.out.println();
    }
  }
}
