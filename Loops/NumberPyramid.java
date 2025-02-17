public class NumberPyramid {
  public static void main(String[] args) {
    int totalRows = 5;
    
    for ( int row = 1; row <= totalRows; row++ ) {
      // print spaces for left alignment
      for ( int space = 1; space <= totalRows - row; space++) {
        System.out.print(" ");
      }
      
      // print the number 'row' repeated 'row' times with a space after each number
      for ( int repeat = 1; repeat <= row; repeat++ ) {
        System.out.print(row + " ");
      }
      System.out.println();
    }
  }
}
