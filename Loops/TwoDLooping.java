public class TwoDLooping {
  public static void main(String[] args) {
  
  for ( int row = 1; row <= 5; row++ ) {
    System.out.println("Rows " + row + ":");
    for ( int seat = 1; seat <= 6; seat++ ) {
      System.out.println("seat " + seat + ":");
    }
    System.out.println("------------");
    }
  }
}
