import java.util.Scanner;

public class GradeCheck {

  public static void main(String args[]) {
  
  Scanner inputScore = new Scanner(System.in);
  
  System.out.print("Input Student Score between (0 - 100): ");
  
  int score = inputScore.nextInt();
  
 if ( score < 0 && score > 100 ) {
   if ( score >= 50 ) {
    System.out.println("Pass");
  } else {
    System.out.println("Fail");
  } 
 }  else {
    System.out.println("Enter a valid score range");
  }
  
  }

}
