import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base;
        
        do {
            System.out.print("Enter the base length (1-10): ");
            base = input.nextInt();
        } while (base < 1 || base > 10);
        
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
