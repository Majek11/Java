public class WorldPopulationGrowth {
    public static void main(String[] args) {
    
        double currentPopulation = 8.1;
        
        final double GROWTH_RATE = 0.0081;
        
        boolean doubledFound = false;
        int doubledYear = 0;
        double initialPopulation = currentPopulation;
        
        System.out.println("World Population Growth Projection (2024-2099)");
        System.out.println("------------------------------------------------");
        System.out.printf("%-6s%-20s%-20s%n", "Year", "Population (billions)", "Annual Increase (millions)");
        System.out.println("------------------------------------------------");
        
        for (int year = 1; year <= 75; year++) {
            double previousPopulation = currentPopulation;
            
            currentPopulation = previousPopulation * (1 + GROWTH_RATE);
            
            double annualIncrease = (currentPopulation - previousPopulation) * 1000;
            
            System.out.printf("%-6d%-20.3f%-20.1f%n", 
                year, 
                currentPopulation, 
                annualIncrease);
            
            if (!doubledFound && currentPopulation >= initialPopulation * 2) {
                doubledFound = true;
                doubledYear = year;
            }
        }
        
        System.out.println("------------------------------------------------");
        System.out.printf("%nAt current growth rate of %.2f%%:%n", GROWTH_RATE * 100);
        System.out.printf("Initial population (2024): %.3f billion%n", initialPopulation);
        System.out.printf("Final population (2099): %.3f billion%n", currentPopulation);
        
        if (doubledFound) {
            System.out.printf("Population will double in year %d (%.0f years from now)%n", 
                2024 + doubledYear, (double)doubledYear);
        } else {
            System.out.println("Population will not double within the 75-year period");
        }
    }
}
