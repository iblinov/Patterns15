package by.epam.pattern.observertrue;

public class DataHolder implements Observable {
  private double side;
  private DataObserver observer;
  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
    notifyObservers();
  }

  @Override
  public void attach(DataObserver observer) {
    this.observer = observer;
  }

  @Override
  public void detach(DataObserver observer) {
    // checking
    this.observer = null;
  }

  @Override
  public void notifyObservers() {
    // checking
    observer.actionPerformed(new DataEvent(this));
  }
}
