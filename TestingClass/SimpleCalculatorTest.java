import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest{

  @Test
  public void testThatCalculatorCanAddTwoNumbers() {
    SimpleCalculator myCalculator = new SimpleCalculator();
    assertEquals(6, myCalculator.add(2, 4));
  }
  
  @Test
  public void testThatCalculatorCanSubtractTwoNumbers() {
    SimpleCalculator myCalculator = new SimpleCalculator();
    assertEquals(7, myCalculator.subtract(10, 3));
  }
  
  @Test
  public void testThatCalculatorCanMultiplyTwoNumbers() {
    SimpleCalculator myCalculator = new SimpleCalculator();
    assertEquals(10, myCalculator.multiply(5, 2));
  }
  
  public void sayHello(String name) {
    System.out.println("Hello" +name);
  }
}
