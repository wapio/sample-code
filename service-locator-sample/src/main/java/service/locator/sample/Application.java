package service.locator.sample;

import java.util.List;

import service.locator.sample.domain.Restraurant;
import service.locator.sample.service.RestraurantService;

public class Application {

  public static void main(String[] args) {
    
    Application app = new Application();
    app.execute();
  }

  private void execute() {
    
    RestraurantService service = new RestraurantService();
    List<Restraurant> restraurants = service.getRestraurants();
    System.out.println(restraurants);
  }
}
