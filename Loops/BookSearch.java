public class BookSearch {
  public static void main(String[] args) {
  
  String[] Library = {"Book A", "Book B", "My Favorite Book", "Book C"};
  
  for ( String book : Library ) {
    if (book.equals("My Favorite Book")) {
      System.out.println("Book found");
      break;
    }
  }
  
  }
}
