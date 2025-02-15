import java.util.Random;

public class DiceGame {
  public static void main(String[] args) {
  
  Random rand = new Random(); // create a random object
  int roll;
  
  do {
    roll = rand.nextInt(6) + 1; // Generate a number between 1 and 6
    System.out.println("You rolled: " + roll);
  } while (roll != 6); // Keep rolling until we get a 6
  System.out.println("You got a 6! Game over");
  }
}
