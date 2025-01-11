import java.util.Scanner;

public class HasNext {

	public static void main(String[] args) {
	
	Scanner input = new Scanner("True");
	
	System.out.println("Enter customer's name");
	String customerName = input.nextLine();
	
	while ( input.hasNext() && !input.hasNextBoolean() ) {
	  	input.next();
	}
	
	if ( input.hasNextBoolean() ) {
	  System.out.print("");
	  System.out.println(input.nextBoolean());
	} else {
	  System.out.println("No boolean found");
	}
	
	//while ( !input.hasNextInt()) {
	  //System.out.println("Invalid input. Enter number to continue");
	  //input.next();
	//}
	}
}
