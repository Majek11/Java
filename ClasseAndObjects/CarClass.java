// Example of a class using a car

// create the class
public class CarClass {
  
  // create the properties of a car
  String brand;
  String color;
  int speed;
  
  // methods( behaviour )
  public void displayInfo() {
    System.out.println("Brand: " + brand + "\nColor: " + color + "\nSpeed: " + speed + "km/hr");
  }
  
    public static void main(String[] args) {
      // create objects
      CarClass car1 = new CarClass();
      CarClass car2 = new CarClass();
      
      // set properties for car1
      car1.brand = "Benz";
      car1.color = "Blue";
      car1.speed = 90;
      
      // set properties for car2
      car2.brand = "Toyota";
      car2.color = "Black";
      car2.speed = 120;
      
      car1.displayInfo();
      car2.displayInfo();
    }
}
  
