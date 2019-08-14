package service.locator.sample.service;

import java.util.ArrayList;
import java.util.List;

import service.locator.sample.domain.Location;
import service.locator.sample.domain.Restraurant;
import service.locator.sample.service.locator.ServiceLocator;

public class RestraurantService {

  public List<Restraurant> getRestraurants() {

    // GeolocationService locationService = new GoogleGeolocationService();
    GeolocationService locationService = ServiceLocator.resolve("service.locator.sample.service.GoogleGeolocationService");
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
