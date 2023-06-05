package by.epam.pattern.observer;

public class CurrentPointObserver implements PointObserver {
  @Override
  public void actionPerformed(PointEvent event) {
    Point point = event.getSource();
    int newX = point.getX() * 2;
    Parameter.getInstance().setX2(newX);
  }
}
