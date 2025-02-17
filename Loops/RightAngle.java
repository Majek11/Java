public class RightAngle {
  public static void main(String[] args) {
  
  int num = 6;
  
  for ( int row = 1; row <= num; row++ ) {
    for ( int space = num; space >= row; space-- ) {
      System.out.print(" ");
    }
    for ( int repeat = 1; repeat <= row; repeat++ ) {
      System.out.print("*");
    }
   System.out.println();
    }
  }
}
