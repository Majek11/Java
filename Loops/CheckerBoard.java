public class CheckerBoard {
  
  public static void main(String[] args) {
  
  int num = 4;
  
  for ( int x = 1; x <= num + 1; x++ ) {
    System.out.print("X");
    for ( int o = 1; o <= x + 1; o-- ) {
      System.out.print("O");
    }
    System.out.println();
  }
  
  }
}
