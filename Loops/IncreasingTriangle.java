public class IncreasingTriangle {
  public static void main(String[] args) {
  
  // Rows
  for ( int rows = 1; rows <= 6; rows++) {
    //columns
    for ( int cols = 1; cols <= rows; cols++) {
      System.out.print("*");
    }
    
    System.out.println();
  }
  }
}
