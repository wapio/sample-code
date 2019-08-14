package di.pattern.sample;

import java.util.List;

import di.pattern.sample.domain.Restraurant;
import di.pattern.sample.service.GoogleGeolocationService;
import di.pattern.sample.service.RestraurantService;

public class Application {

  public static void main(String[] args) {
    
    Application app = new Application();
    app.execute();
  }

  private void execute() {

    GoogleGeolocationService locationService = new GoogleGeolocationService();
    RestraurantService service = new RestraurantService(locationService);
    List<Restraurant> restraurants = service.getRestraurants();
    System.out.println(restraurants);
  }
}
