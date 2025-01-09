public class MultiplesOfFourFiveTimes {

    public static void main(String[] args) {
        
      System.out.println("Multiples of 4 between 1 and 10 (each printed 5 times):");
        for (int i = 1; i <= 10; i++) {
          if (i % 4 == 0) {
            for (int j = 0; j < 5; j++) {
              System.out.println(i);
                }
            }
        }
    }
}

