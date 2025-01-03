import java.util.Scanner;

public class TaxCalculator {

  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  final int NUM_CITIZENS = 3;
  
  for (int i = 1; i <= NUM_CITIZENS;i++ ) {
    System.out.printf("Enter name of citizens %d%n", i);
    String name = input.next();
    
    System.out.printf("Enter yearly earnings for %s%n: ", name);
    double earnings = input.nextDouble();
    
    double tax;
    if ( earnings <= 30000 ) {
      tax = earnings * 0.15;
    } else {
      tax =( 30000 * 0.15 ) +   ((earnings - 30000) * 0.20);
    }
    
    System.out.printf("Total tax for %s: $%f%n", name, tax);
  }
  
  }
}
