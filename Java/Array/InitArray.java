import java.util.Scanner;

public class InitArray {
	public static void main(String[] args) {
	
	int[] array = new ;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Input");
	int number = input.nextInt();
	
	System.out.printf("%5s%8s%n", "Index", "Value");
	
	for ( int counter = 0; counter < array.length; counter++ ) {
	  System.out.printf("%d%10d%n", counter, array[counter] );  
	}
	
	}
}
