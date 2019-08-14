package di.pattern.sample.domain;

public class Restraurant {

  private Location location;

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "Restraurant [location=" + location + "]";
  }
}
