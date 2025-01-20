public class Card {

  private final String face; // face of cards
  private final String suit; // suit of card
  
  // two-argument constructor initialize card's face and suit
  public Card ( String cardFace, String cardSuit ) {
    this.face = cardFace; // initialize card face
    this.suit = cardSuit; // initialize card suit 
  }
  
  // return String representation of Card
  public String toString() {
    return face + " of " + suit;
  }

}
