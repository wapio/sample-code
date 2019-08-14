package di.pattern.sample.service.locator;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {

  private static final Map<String, Object> INSTANCES_CONTAINER = new HashMap<>();

  public static <T> T resolve(String className) {
    try {

      if (!INSTANCES_CONTAINER.containsKey(className)) {
        INSTANCES_CONTAINER.put(className, Class.forName(className).getConstructor().newInstance());
      }
      return (T) INSTANCES_CONTAINER.get(className);

    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
        | NoSuchMethodException | SecurityException | ClassNotFoundException e) {

      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
