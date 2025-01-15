public class SimpleCalculator {

  public int add(int firstNumber, int secondNumber) {
    int sum = firstNumber + secondNumber;
    return sum;
  }
  
  public int subtract( int firstNumber, int secondNumber) {
    int subtract = firstNumber - secondNumber;
    return subtract;
  }
  
    public int multiply( int firstNumber, int secondNumber) {
    int multiply = firstNumber * secondNumber;
    return multiply;
  }
  
  public int addAllNumbers ( int[] numbers ) {
    int result = 0;
    for ( int i = 0; i < numbers.length; i++) {
      result += numbers[i];
    }
    return result;
  }
  
  public int multiplyfeature ( int digit, int multiply ) {
    int total = 0;
    for ( int i = 0; i <= multiply; i++ ) {
      total *= digit; 
    }
    return total;
  }

}
