package by.epam.pattern.singleton;

public class Singleton {
  private static Singleton instance;// = new Singleton();
  private StringBuilder builder;
  private Singleton(){
    builder = new StringBuilder();
  }
  public static Singleton getInstance(){
    if(instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
  public StringBuilder append(String str) {
    return builder.append(str);
  }
  public static void operation() {}
}
