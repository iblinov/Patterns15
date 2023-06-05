package by.epam.pattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SingletonCount {
  private static final int RANGE = 3;
  private static int counter;
  private static List<SingletonCount> listInstance = new ArrayList<>(3);
  private SingletonCount() {
  }
  public static SingletonCount getInstance() {
    if (counter < RANGE) {
      SingletonCount ob = new SingletonCount();
      listInstance.add(ob);
      counter++;
      return ob;
    } else {
      int index = new Random().nextInt(RANGE);
      return listInstance.get(index);
    }

  }
}
