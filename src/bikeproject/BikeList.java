package bikeproject;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import javax.crypto.spec.PSource;
import org.w3c.dom.ls.LSOutput;

public class BikeList {

  public static void main(String[] args) {
    ArrayList<Bike> bikes = new ArrayList();
    int mountainBikeSales, roadBikeSales = 0;
    //bikes.add(new MountainBike());
    fillArray(bikes);
    //displayStock(bikes);
    //System.out.println(bikes.get(0));
    System.out.println(calculateStock(bikes));
    displayBikeNumbers(bikes);
  }

  public static void fillArray(ArrayList<Bike> bikes) {
    for (int bikeCount = 0; bikeCount < 10; bikeCount++) {
      int rando = new Random().nextInt(2);
      /*Also acceptable is
       * Random rand = new Random();
       * rand.nextInt(2)*/
      if (rando < 1) {
        bikes.add(new MountainBike());
      } else {
        bikes.add(new RoadBike());
      }
    }
    displayStock(bikes);
  }

  public static void displayStock(ArrayList<Bike> bikes) {
    int i = 0;
    for (Bike element : bikes) {
      System.out.println(bikes.get(i));
      i++;
    }
  }

  public static int calculateStock(ArrayList<Bike> bikes) {
    int bikesSold = 0;
    for (int bike = 0; bike < 10; bike++) {
      if (bikes.get(bike) instanceof MountainBike) {
        bikesSold -= -1;
      }
    }
    return bikesSold;
  }

  public static int displayBikeNumbers(ArrayList<Bike> bikes){
    int mb = calculateStock(bikes);
    int rb = bikes.size() - mb;
    System.out.println("Stock Levels");
    System.out.println("We have " + mb + " Mountain Bikes in stock");
    System.out.println("We have " + rb + " Road Bikes in stock");
    return 0;
  }
}
