package service.locator.sample.domain;

public class Location {

  private String latitude;

  private String longtude;

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongtude() {
    return longtude;
  }

  public void setLongtude(String longtude) {
    this.longtude = longtude;
  }

  @Override
  public String toString() {
    return "Location [latitude=" + latitude + ", longtude=" + longtude + "]";
  }

}
