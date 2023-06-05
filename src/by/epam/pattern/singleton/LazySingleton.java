package by.epam.pattern.singleton;

public class LazySingleton {
  private LazySingleton(){}
  private static class SingletonHolder {
    private static LazySingleton singleton = new LazySingleton();
  }
  public static LazySingleton getInstance() {
    return SingletonHolder.singleton;
  }
}
