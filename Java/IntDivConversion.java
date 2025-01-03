public class IntDivConversion {
	
	public static void main(String args[]) {
	
	int firstNumber = 2089;
	int secondNumber = 9;
	
	double division = (double) firstNumber / secondNumber;
	
	System.out.printf("Original Result: %f%n", division);
	
	double convertedResult = (double) division;
	System.out.printf("Converted Result: %f%n", convertedResult);
	}
}
