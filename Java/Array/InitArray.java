public class InitArray {
	public static void main(String[] args) {
	
	int[] array = {32, 40, 50, 60, 70, 120, 22};
	
	System.out.printf("%5s%8s%n", "Index", "Value");
	
	for ( int counter = 0; counter < array.length; counter++ ) {
	  System.out.printf("%d%10d%n", counter, array[counter] );  
	}
	
	}
}
