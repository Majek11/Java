public class DecreasingPattern {
  
  public static void main(String[] args) {
  
  int n = 6;
  
  for ( int i =1; i <= n; i++) {
    System.out.print("  ");
    for ( int j = i; j <= n; j++) {
      System.out.print("*"); 
    }
    System.out.println();
  }
}
}
