public class RiderWageCalculator {

    public static int calculateWage(int successfulDeliveries) {
    
        int basePay = 5000;
        int amountPerParcel;

        if (successfulDeliveries < 50) {
            amountPerParcel = 160;
        } else if (successfulDeliveries >= 50 && successfulDeliveries <= 59) {
            amountPerParcel = 200;
        } else if (successfulDeliveries >= 60 && successfulDeliveries <= 69) {
            amountPerParcel = 250;
        } else {
            amountPerParcel = 500;
        }

        return (successfulDeliveries * amountPerParcel) + basePay;
    }

    public static void main(String[] args) {
        System.out.println(calculateWage(80));
        System.out.println(calculateWage(25));
        System.out.println(calculateWage(55));
        System.out.println(calculateWage(65));
    }
}

