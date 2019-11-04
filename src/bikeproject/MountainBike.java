package bikeproject;

public class MountainBike extends Bike implements MountainParts {

  private String suspension, type;
  private int frameSize;

  public final String TERRAIN = "off_road";

  public String getSuspension(){
    return suspension;
  };

  public void setSuspension(String newValue){
    this.suspension = newValue;
  };

  public String getType(){
    return type;
  };

  public void setType(String newValue){
    this.type = newValue;
  };

  public MountainBike() {
    this("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
  }//end constructor

  public MountainBike(String handleBars, String frame, String tyres, String seatType, int numGears,
      String suspension, String type, int frameSize) {
    super(handleBars, frame, tyres, seatType, numGears);
    this.suspension = suspension;
    this.type = type;
    this.frameSize = frameSize;
  }//end constructor

  public String mbString() {
    return "I'm a Mountain Bike!";
  }

  public String toString() {

    return super.toString() + "This mountain bike is a " + this.type + " bike and has a " + this.suspension
        + " suspension and a frame size of " + this.frameSize + "inches." + "\nThis bike is best for " + MountainParts.terrain;

  }//end method printDescription
}//end class MountainBike
