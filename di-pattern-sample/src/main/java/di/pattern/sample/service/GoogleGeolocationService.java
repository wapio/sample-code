package di.pattern.sample.service;

import di.pattern.sample.domain.Location;

public class GoogleGeolocationService implements GeolocationService {

  @Override
  public Location getCurrentLocation(String id) {
    
    Location location = new Location();
    location.setLatitude("1234");
    location.setLongtude("1234");
    return location;
  }

}
