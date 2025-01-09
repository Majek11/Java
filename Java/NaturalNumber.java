public class NaturalNumber {

  public static void main(String[] args) {
    int sum = 0;

    for (int natNum = 1; natNum <= 10; natNum++) {
      System.out.print(natNum + ""); 
      sum = sum + natNum;
    }
    System.out.printf("\nSum of the first 10 natural numbers: %d%n", sum);
  }
}

