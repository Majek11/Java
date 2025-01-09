public class TabularOutput {
    public static void main(String[] args) {
    
        System.out.printf("%4s%6s%6s%6s%6s%n", "N", "N^2", "N^3", "N^4", "N^5");
        
        for (int n = 1; n <= 5; n++) {
            System.out.printf("%4d%6d%6d%6d%6d%n", 
                n,            
                n * n,         
                n * n * n,     
                n * n * n * n, 
                n * n * n * n * n  
            );
        }
    }
}
