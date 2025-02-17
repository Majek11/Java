public class ReversePyramid {
  public static void main(String[] args) {

  int totalRows = 0;
  
  for ( int rows = 5; rows > totalRows; rows-- ) { 
    for ( int space = 5; space > totalRows + rows; space-- ) {
      System.out.print(" ");
  }
  
  for ( int repeat = 1; repeat <= rows; repeat++ ) {
    System.out.print(rows + " ");
  }
  System.out.println();
  }

  }
}
