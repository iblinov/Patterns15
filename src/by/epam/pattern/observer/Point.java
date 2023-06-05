package by.epam.pattern.observer;

public class Point implements PiontObservable {
  private int x;
  private PointObserver observer;
  public Point(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
    notifyObserber();
  }

  @Override
  public void attach(PointObserver observer) {
    this.observer = observer;
  }

  @Override
  public void detach(PointObserver observer) {
   //
    this.observer = null;
  }

  @Override
  public void notifyObserber() {
    // null
    observer.actionPerformed(new PointEvent(this));
  }
}
