import  java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        Scanner userInput= new Scanner(System.in);
        System.out.print("Enter the  number of times you want to greet:  ");

        int  numberOfGreeting  =  userInput.nextInt();
        int displayGreetings = 0;

        if ( numberOfGreeting > 0 && numberOfGreeting < 10 ) {
            System.out.println("Greetings must be between 1 and 10");
        } else {
            System.out.println("Greetings must be between 1 and 10");
        }
    }
}


