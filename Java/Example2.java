public class Example2 {
  
  public static void main(String[] args) {
  
  
  int a = 70; int b = 50; int c = 60;
  
  int largest; 
  
  //if ( a > b && a > c) {
    //largest = a;
  //} else if ( b > c ) {
    //largest = b;
  //} else {
    //largest = c;
  //}
  
  int largest =  (a > b) ? ( a > c ? a : c ) : ( b > c ? b : c);
  
  System.out.println(largest);
   
  
  }
}

