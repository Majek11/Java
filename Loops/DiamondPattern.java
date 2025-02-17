public class DiamondPattern {
  public static void main(String[] args) {
  
  int num = 4;
  
  // upper part
  for ( int row = 1; row <= num; row++ ) {

  // spaces
    for ( int space = 1; space <= num - row; space++ ) {
      System.out.print("  ");
    }
  // stars
    for ( int star = 1; star <= 2 * row - 1; star++ ) {
      System.out.print("* ");
    }
    System.out.println();
}

  // down part
  for ( int row = num - 1; row >= 1;  row-- ) {
    
    // spaces
    for ( int space = 1; space <= num - row; space++ ) {
      System.out.print("  ");
    }
    // stars
    for ( int star = 1; star <= 2 * row - 1; star++ ) {
      System.out.print("* ");
    }
    System.out.println();
  }
    }
  }
