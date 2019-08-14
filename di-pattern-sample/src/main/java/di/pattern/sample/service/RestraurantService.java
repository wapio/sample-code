package di.pattern.sample.service;

import java.util.ArrayList;
import java.util.List;

import di.pattern.sample.domain.Location;
import di.pattern.sample.domain.Restraurant;

public class RestraurantService {

  private final GeolocationService locationService;

  public RestraurantService(GeolocationService locationService) {
    this.locationService = locationService;
  }
  
  public List<Restraurant> getRestraurants() {

    return getRestraurants(locationService.getCurrentLocation(null));
  }

  private List<Restraurant> getRestraurants(Location locations) {

    List<Restraurant> restraurants = new ArrayList<>();
    Restraurant r = new Restraurant();
    r.setLocation(locations);
    restraurants.add(r);
    return restraurants;
  }

}
