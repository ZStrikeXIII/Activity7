package bikeproject;

public interface RoadParts {

  //public final String TERRAIN = "track_racing";

  public final BikeUses terrain = BikeUses.track;

  public int getTyreWidth();

  public void setTyreWidth(int newValue);

  public int getPostHeight();

  public void setPostHeight(int newValue);
}
