package by.epam.pattern.observertrue;

public class DataHypotObserver implements DataObserver {
  @Override
  public void actionPerformed(DataEvent event) {
    DataHolder data = event.getSource();
    double side = data.getSide();
    double result = Math.hypot(side, side);
    ResultWarehouse warehouse = ResultWarehouse.getInstance();
    warehouse.offer(result);
  }
}
