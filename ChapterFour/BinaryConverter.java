import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number (containing only 0s and 1s): ");
        int binary = input.nextInt();
        
        int decimal = 0;
        int power = 0;
        int originalBinary = binary;
        
        while (binary > 0) {
            int digit = binary % 10;
            
            if (digit != 0 && digit != 1) {
                System.out.println("Invalid binary number!");
                return;
            }
            
            decimal += digit * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        
        System.out.printf("Binary number %d is decimal number %d%n", 
            originalBinary, decimal);
    }
}
