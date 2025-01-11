import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class CheckoutApp {
    static class Product {
        String name;
        double price;
        int quantity;

        Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Product> cart = new ArrayList<>();
        
        double total = 0;

        System.out.println("Welcome to Semicolon Store Checkout System! 🏪");

        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();
        
        System.out.println("\nWelcome to our store " + customerName + "!🤩");

        System.out.println("\nPlease enter the details of the products in the cart.");
        
        while (true) {
            System.out.print("Enter product name: (or 'done' to finish): ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("done")) break;

            double price = 0;
            while (true) {
                System.out.print("Enter price of " + name + ": ");
                try {
                    price = Double.parseDouble(input.nextLine());
                    if (price < 0) throw new IllegalArgumentException();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid price! Please enter a positive number.");
                }
            }

            int quantity = 0;
            while (true) {
                System.out.print("Enter quantity of " + name + ": ");
                try {
                    quantity = Integer.parseInt(input.nextLine().trim());
                    

                    if (quantity <= 0) throw new IllegalArgumentException();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid quantity! Please enter a positive integer.");
                }
            }

            cart.add(new Product(name, price, quantity));
            total += price * quantity;
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String currentDateTime = now.format(formatter);

        System.out.println("\n---------------- SEMICOLON STORE INVOICE ----------------");
        System.out.printf("Date & Time: %s%n", currentDateTime);
        System.out.println("Location: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
        System.out.println("Telephone: 0326748489");
        System.out.println("Branch: MAIN BRANCH");
        System.out.println("--------------------------------------------------------");
        System.out.printf("Customer Name: %s%n", customerName);
        System.out.printf("%-20s %-10s %-10s %-10s%n", "Product", "Price", "Quantity", "Total");
        System.out.println("--------------------------------------------------------");
        for (Product product : cart) {
            double itemTotal = product.price * product.quantity;
            System.out.printf("%-20s %-10.2f %-10d %-10.2f%n", product.name, product.price, product.quantity, itemTotal);
        }
        System.out.println("--------------------------------------------------------");
        System.out.printf("Subtotal: %.2f%n", total);

        System.out.print("\nEnter cashier name: ");
        String cashierName = input.nextLine().trim();

        double amountPaid = 0;
        while (true) {
            System.out.print("\nEnter amount paid by the customer: ");
            try {
                amountPaid = Double.parseDouble(input.nextLine().trim());
                if (amountPaid < total) {
                    System.out.println("Insufficient amount! Please collect amount greater or equal to total from customer.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        double discount = (total > 100) ? total * 0.1 : 0;
        double vat = total * 0.075;
        double finalTotal = total - discount + vat;
        double change = amountPaid - finalTotal;

        System.out.println("\n---------------- SEMICOLON STORE RECEIPT 🏪 ----------------");
        System.out.printf("Date & Time: %s%n", currentDateTime);
        System.out.println("Location: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
        System.out.println("Telephone: 0326748489");
        System.out.println("Branch: MAIN BRANCH");
        System.out.println("--------------------------------------------------------");
        System.out.printf("Customer Name: %s%n", customerName);
        System.out.printf("Cashier Name: %s%n", cashierName);
        System.out.println("--------------------------------------------------------");
        System.out.printf("Subtotal: %.2f%n", total);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("VAT (7.5%%): %.2f%n", vat);
        System.out.printf("Final Total: %.2f%n", finalTotal);
        System.out.printf("Amount Paid: %.2f%n", amountPaid);
        System.out.printf("Change: %.2f%n", change);
        System.out.println("--------------------------------------------------------");
        System.out.println("Thank you for shopping with Semicolon Store!");
    }
}

