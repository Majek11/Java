public class AppleFilter {
  public static void main(String[] args) {
  
   String[] basket = {
  "Apple", 
  "Banana", 
  "Orange", 
  "Apple", 
  "Grapes",
  "Apple",
  "Guava",
  "Mango",
  "Watermelon",
  "Apple"
  };
  
  for ( String fruit : basket ) {
    if (!fruit.equals("Apple")) {
      continue;
    }
    System.out.println(fruit);
    }
  } 
}
