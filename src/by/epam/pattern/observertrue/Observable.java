package by.epam.pattern.observertrue;

public interface Observable {
  void attach(DataObserver observer);
  void detach(DataObserver observer);
  void notifyObservers();
}
