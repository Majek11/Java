import java.util.Scanner;

public class UberApp {
  public static void main(String[] args) {
    
    Scanner userInput = new Scanner(System.in);
    
    System.out.print("Enter first score: ");
    int firstScore = userInput.nextInt();
    
    System.out.print("Enter second score: ");
    int secondScore = userInput.nextInt();
    
    System.out.print("Enter third score: ");
    int thirdScore = userInput.nextInt();
  
    System.out.print("Enter fourth score: ");
    int fourthScore = userInput.nextInt();
    
    System.out.print("Enter fifth score: ");
    int fifthScore = userInput.nextInt();
    
    int  smallest = firstScore;
    
    if ( firstScore <= secondScore && firstScore <= thirdScore && firstScore <= fourthScore && firstScore <= fifthScore ) {
      smallest = firstScore;
    }
    
     if ( secondScore <= firstScore && secondScore <= thirdScore && secondScore <= fourthScore && secondScore <= fifthScore ) {
       smallest = secondScore;
    }
    
     if ( thirdScore <= firstScore && thirdScore <= secondScore && thirdScore <= fourthScore && thirdScore <= fifthScore ) {
       smallest = thirdScore;
    }
    
     if ( fourthScore <= firstScore && fourthScore <= secondScore && fourthScore <= thirdScore && fourthScore <= fifthScore ) {
      smallest =  fourthScore;
    }
    
     if ( fifthScore <= firstScore && fifthScore <= secondScore && fifthScore <= thirdScore && fifthScore <= fourthScore ) {
       smallest = fifthScore;
    }
    
    int largest = firstScore;
    
    
    if ( firstScore >= secondScore && firstScore >= thirdScore && firstScore >= fourthScore && firstScore >= fifthScore ) {
      largest = firstScore;
    }
    
     if ( secondScore >= firstScore && secondScore >= thirdScore && secondScore >= fourthScore && secondScore >= fifthScore ) {
       largest = secondScore;
    }
    
    if ( thirdScore >= firstScore && thirdScore >= secondScore && thirdScore >= fourthScore && thirdScore >= fifthScore ) {
       largest = thirdScore;
    }
    
     if ( fourthScore >= firstScore && fourthScore >= secondScore && fourthScore >= thirdScore && fourthScore >= fifthScore ) {
      largest =  fourthScore;
    }
    
     if ( fifthScore >= firstScore && fifthScore >= secondScore && fifthScore >= thirdScore && fifthScore >= fourthScore ) {
       largest = fifthScore;
    }
    
    System.out.printf("The smallest number is: %d%n", smallest);
    System.out.printf("The largest number is: %d%n", largest);
    
  
  }
}
