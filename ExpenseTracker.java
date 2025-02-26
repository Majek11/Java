import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

class Expense {
    String date;
    String description;
    int amount;
    
    Expense(String date, String description, int amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate curr = LocalDate.now();
        ArrayList<Expense> expenses = new ArrayList<>();
        int total = 0;
        
        System.out.println("Welcome to semicolon Expense Tracker App");
        for (int i = 0; i < 40; i++) {
            System.out.print("`");
        }
        System.out.println();
        showMenu();
        
        boolean isValid = true;
        String option = scanner.nextLine();
        while (!option.equals("1") && !option.equals("2") && 
               !option.equals("3") && !option.equals("4")) {
            System.out.println("invalid response");
            System.out.println();
            option = scanner.nextLine();
        }
        
        if (option.equals("1")) {
            String date = curr.toString();
            System.out.println("Enter the date(YYYY-MM-DD): " + date);
            String description = scanner.nextLine();
            while (description.equals("")) {
                System.out.println("You have to input an item");
                description = scanner.nextLine();
            }
            
            int amount = 0;
            while (isValid) {
                try {
                    amount = Integer.parseInt(scanner.nextLine());
                    isValid = false;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number.");
                    System.out.println();
                }
            }
            isValid = true;
            total += amount;
            expenses.add(new Expense(date, description, amount));
        } else if (option.equals("2")) {
            System.out.println("No record made yet");
        } else if (option.equals("3")) {
            System.out.println("No record made yet");
        } else if (option.equals("4")) {
            System.out.println("Bye");
            return;
        }
        
        while (option.equals("1") || option.equals("2") || option.equals("3")) {
            showMenu();
            isValid = true;
            option = scanner.nextLine();
            while (!option.equals("1") && !option.equals("2") && 
                   !option.equals("3") && !option.equals("4")) {
                System.out.println("Invalid response");
                option = scanner.nextLine();
            }
            
            if (option.equals("1")) {
                String date = curr.toString();
                System.out.println("Enter the date(YYYY-MM-DD): " + date);
                String description = scanner.nextLine();
                while (description.equals("")) {
                    System.out.println("You have to input an item");
                    description = scanner.nextLine();
                }
                
                int amount = 0;
                while (isValid) {
                    try {
                        amount = Integer.parseInt(scanner.nextLine());
                        isValid = false;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Please enter a number.");
                        System.out.println();
                    }
                }
                isValid = true;
                total += amount;
                expenses.add(new Expense(date, description, amount));
            } else if (option.equals("2")) {
                if (expenses.size() == 0) {
                    System.out.println("No record made yet");
                } else {
                    System.out.println("Date              Description              Amount");
                    for (int i = 0; i < expenses.size(); i++) {
                        Expense exp = expenses.get(i);
                        System.out.println(exp.date + "          " + 
                                        exp.description + "                   " + 
                                        exp.amount);
                    }
                }
            } else if (option.equals("3")) {
                if (total == 0) {
                    System.out.println("No record made yet");
                } else {
                    System.out.println("The total expenses are " + total);
                }
            } else if (option.equals("4")) {
                System.out.println("Bye");
                break;
            }
        }

    }
    
    private static void showMenu() {
        System.out.println("\n1. Add an expense");
        System.out.println("2. View all expense");
        System.out.println("3. Calculate total expenses");
        System.out.println("4. Exit\n");
    }
}
