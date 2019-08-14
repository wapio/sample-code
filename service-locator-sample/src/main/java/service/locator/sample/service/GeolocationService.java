package service.locator.sample.service;

import service.locator.sample.domain.Location;

public interface GeolocationService {

  Location getCurrentLocation(String id);

}
