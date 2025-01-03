public class TypeConversion {
  
  public static void main(String args[]) {
  
  
  byte b;
  
  int i = 576;
  double d = 453.987;
  
  System.out.println("Conversion of int to byte");
  b = (byte) i;
  
  System.out.println("Conversion of int to byte");
  b = (byte) d;
  
  System.out.printf("Original int: %d, Converted byte: %d%n", i, b);
  System.out.printf("Original double: %f, Converted byte: %d%n", d, b);
  }
}
