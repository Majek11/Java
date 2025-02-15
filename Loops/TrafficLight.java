public class TrafficLight {
  public static void main(String[] args) {
  String[] Lights = {"Green", "Yellow", "Red", "Green", "Red"};
  
  for ( String light : Lights ) {
    if (light.equals("Red")) {
      System.out.println(" Light is RED --> STOP! ");
      break;
    }
    System.out.println(" Light is " + light + "  --> Keep Driving");
  }
  
  }
}
