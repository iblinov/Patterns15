package by.epam.pattern.observertrue;

import java.util.ArrayDeque;

public class ResultWarehouse {
  private static ResultWarehouse instance = new ResultWarehouse();
  private ArrayDeque<Double> deque = new ArrayDeque<>();

  private ResultWarehouse() {

  }
  public static  ResultWarehouse getInstance() {
    return instance;
  }
  public boolean offer(Double value) {
    return deque.offer(value);
  }

  public Double poll() {
    return deque.poll();
  }
}
