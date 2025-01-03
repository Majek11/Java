public class FiveMultiplesOfEachResult {
  
    public static void main(String[] args) {
        
      System.out.println("Powers of each multiple of 4 between 1 and 10:");

      for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                System.out.printf("Powers of :", i);
                int result = i;
                for (int count = 1; count <= 5; count++) {
                    System.out.println(result);
                    result = result * i;
                }
            }
        }
    }
}

