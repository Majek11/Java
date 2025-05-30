public class Time1 {
  private int hour;
  private int minute;
  private int second;
  
  // set a new time value using universal time; throw an exception if the hour, minute or second is invalid
  public void setTime(int hour, int minute, int second) {
    // validate hour, minute and second
    if ( hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60 ) {
      throw new IllegalArgumentException("hour, minute and/or second was out of range")
    }
    
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  
  // convert to String in univeral-time format (HH:MM:SS)
  public String toUniversalString() {
    return String.format("%d:%d:%d", hour, minute, second);
  }
  
  // convert to String in standard-time format (H:MM:SS AM or PM)
  public String toString() {
    return String.format("%d:%d:%d %s", ((hour == 0 || hour == 12 ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
  }
}
