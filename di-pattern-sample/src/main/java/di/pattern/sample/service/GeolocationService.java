package di.pattern.sample.service;

import di.pattern.sample.domain.Location;

public interface GeolocationService {

  Location getCurrentLocation(String id);

}
