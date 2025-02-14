public class AdvanceMultiplicationTable {

  public static void main(String[] args) {
  
  for ( int i = 1; i <= 5; i++) {
        System.out.println("Multiplication Table For "+ i);
        System.out.println("----------------");
    for ( int j = 1; j <= 12; j++){
      System.out.println(i + " * " + j + " = " + i * j);
    }
    System.out.println();
  } 
  }
}
