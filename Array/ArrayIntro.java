import java.util.Arrays;

public class ArrayIntro {

  public static void main(String[] args){
  
  // Declaration
  //int[] arr;
  
  // initialization
 // int[] arr = new int[10];
  
  // Inline initialization
  // int[] arr = {1,2,3,4,5,6,7};
  
  // 3 X 3Matrix
  //int[][] matrix = new int[3][3];
  int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
  
  //Jagged Arrays
    
  //Combining dynamic assignment and initialization
    int[][] jaggedArray = new int[2][];
    
    jaggedArray[0] = new int[] {1,2,3};
    
    jaggedArray[1] = new int[4] // Row 1: 4 elements
    
    // Direct Initialization of values
      //int[][] jagged = {
   // {1,2}, // Row 0: 2 elements
   // {3,4,5,6}, // Row 1: 4 elements
   // {5,3,6,2,8,9} // Row 2: 6 elements
  };
 // jagged[0] = new int[2];
 // jagged[1] = new int[4];
 // jagged[2] = new int[5];
  

  System.out.println(Arrays.deepToString(matrix));  
  System.out.println(Arrays.deepToString(jagged));
  }
}
