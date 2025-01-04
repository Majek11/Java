import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its factorial: ");
        int number = input.nextInt();
        long factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.printf("%d! = %d%n", number, factorial);
        
        System.out.print("Enter number of terms to estimate e: ");
        int terms = input.nextInt();
        double estimate = 1.0;
        factorial = 1;
        
        for (int i = 1; i <= terms; i++) {
            factorial *= i;
            estimate += 1.0 / factorial;
        }
        System.out.printf("e ≈ %.10f%n", estimate);
        
        System.out.print("Enter x for e^x calculation: ");
        double x = input.nextDouble();
        System.out.print("Enter number of terms: ");
        terms = input.nextInt();
        
        double ex = 1.0;
        double power = 1.0;
        factorial = 1;
        
        for (int i = 1; i <= terms; i++) {
            power *= x;
            factorial *= i;
            ex += power / factorial;
        }
        System.out.printf("e^%.2f ≈ %.10f%n", x, ex);
    }
}
