package by.epam.pattern.observer;

public interface PiontObservable {
  void attach(PointObserver observer);
  void detach(PointObserver observer);
  void notifyObserber();
}
