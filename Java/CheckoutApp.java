import java.util.Scanner;

public class CheckoutApp {

  public static void main(String[] args) {
  
  Scanner inputCollector = new Scanner(System.in);
  
  
  for ( int i = 0; i < 11; i++ ) {
  
  String customerName;
    
  while( true ) {
    System.out.println("Enter customer name: ");
    customerName = inputCollector.nextLine();
    
    System.out.println("What did the " + customerName + " buy? ");
    String userBuy = inputCollector.nextLine();
    
    System.out.println("How many pieces? ");
    int userPieces = inputCollector.nextInt();
 
    if ( customerName.isEmpty() ) {
      System.out.println("Name cannot be empty!");
    }
    else if (customerName.matches(".*\\d.*")) {
      System.out.println("Name cannot contain numbers. Please try again.");
    } 
    else if ( !customerName.matches("[a-zA-Z ]")){
      break;    
    } else {
      System.out.println("Enter a valid name. Name must contain letters only");
    }
  }
  
  
  
}

   
    
    
    
    
    //System.out.println("How much per unit?");
    //int userUnit = inputCollector.nextInt();
  
  
  }
}














