import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a four-digit integer to encrypt: ");
        int number = input.nextInt();
        
        int digit1 = number / 1000;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;
        
        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;
        
        int temp = digit1;
        digit1 = digit3;
        digit3 = temp;
        
        temp = digit2;
        digit2 = digit4;
        digit4 = temp;
        
        int encrypted = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;
        
        System.out.printf("Encrypted number is: %04d%n", encrypted);
    }
}
