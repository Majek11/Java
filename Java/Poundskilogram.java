import java.util.Scanner;

public class Poundskilogram {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");

        double numberInPounds = userInput.nextDouble();

        double poundConstant = 0.454;

        double poundToKilograms = numberInPounds * poundConstant;

        System.out.println(numberInPounds + " pounds is " + poundToKilograms + " kilograms");
    }
}

