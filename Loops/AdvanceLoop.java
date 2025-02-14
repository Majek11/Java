public class AdvanceLoop {
  public static void main(String[] args) {
  
  for ( int num = 1; num <= 20; num++ ) {
    if ( num % 2 == 0 ) {
      System.out.println("Even number");
      continue;
    }  
    if ( num == 12 ) {
      System.out.println("Twelve found");
      break;
    }
    System.out.println(num);
  }
  
  }
}
