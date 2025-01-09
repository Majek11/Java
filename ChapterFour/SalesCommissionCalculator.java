import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
    
        Scanner userInput = new Scanner(System.in);

        final double baseSalary = 200.0;

        final double commisionRate = 0.09;

        double totalSales = 0.0;

        System.out.println("Enter the price of items sold (type -1 to finish):");

        while (true) {
            System.out.print("Enter item price: ");
            double itemPrice = userInput.nextDouble();

            if (itemPrice == -1) {
                break;
            }
            totalSales += itemPrice;
        }

        double commission = totalSales * commisionRate;
        double totalEarnings = baseSalary + commission;

        System.out.printf("Total sales: $%.2f%n", totalSales);
        System.out.printf("Commission (9%%): $%.2f%n", commission);
        System.out.printf("Total earnings: $%.2f%n", totalEarnings);
    }
}

