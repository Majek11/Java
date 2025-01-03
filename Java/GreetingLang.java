import java.util.Scanner;

public class GreetingLang {

  public static void main(String[] args) {
  
  Scanner reader = new Scanner(System.in);
  
  System.out.print("Enter number one to get a greeting in Yoruba");
  int numberOne = reader.nextInt();
  
  System.out.print("Enter number two to get a greeting in Hausa");
  int numberTwo = reader.nextInt();
  
  System.out.print("Enter number three to get a greeting in Igbo");
  int numberThree = reader.nextInt();
  
  switch ( numberOne ) {
  
    case 1: System.out.print("Ekaaroo oo!!");
    break;
    
    case 2: System.out.print("Nnawni");
    break;
    
    case 3: System.out.print("Daaluu!!");
  
  }
  
  
  }
}
