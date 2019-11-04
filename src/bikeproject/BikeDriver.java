package bikeproject;

public class BikeDriver {

  public static void main(String[] args) {

    RoadBike bike1 = new RoadBike();
    RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);
    MountainBike bike3 = new MountainBike();
    //Bike bike4 = new Bike();

    Bike bike5 = (Bike)bike1;

    System.out.println(bike5.toString());
    System.out.println(bike2.toString());
    System.out.println(bike3.toString());
    //bike4.printDescription();

    Bike myBikes[] = {bike1, bike2, bike3};
    for (Bike myBike : myBikes) {
      myBike.bikeString();
    }
  }//end method main

}//end class BikeDriver
