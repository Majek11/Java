import java.util.Scanner;

public class PizzaOrderApp {
    public static void main(String[] args) {
    
        String[] pizzaTypes = {"Sapa size", "Small Money", "Big boys", "Odogwu"};
        int[] slicesPerBox = {4, 6, 8, 12};
        int[] pricePerBox = {2500, 2900, 4000, 5200};

        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the number of people: ");
        int numPeople = userInput.nextInt();
         

        
        
        userInput.nextLine();
        System.out.print("Enter the pizza type (Sapa size, Small Money, Big boys, Odogwu): ");
        String pizzaType = userInput.nextLine();

        int pizzaIndex = -1;
        for (int i = 0; i < pizzaTypes.length; i++) {
            if (pizzaTypes[i].equalsIgnoreCase(pizzaType)) {
                pizzaIndex = i;
                break;
            }
        }

        if (pizzaIndex == -1) {
            System.out.println("Invalid pizza type. Please try again.");
            return;
        }
        
        

        int slices = slicesPerBox[pizzaIndex];
        int price = pricePerBox[pizzaIndex];

        int numBoxes = (int) Math.ceil((double) numPeople / slices);
        int totalSlices = numBoxes * slices;
        int leftoverSlices = totalSlices - numPeople;
        int totalPrice = numBoxes * price;

        System.out.println("Number of boxes of pizza to buy = " + numBoxes + " boxes");
        System.out.println("Number of slices left over after serving = " + leftoverSlices + " slices");
        System.out.println("Price = " + totalPrice + " Naira");
    }
}

