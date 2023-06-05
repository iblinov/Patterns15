package by.epam.pattern.observer;

public class Parameter {
  private static Parameter parameter = new Parameter();
  private double x2;
  private Parameter() {
  }
  public static Parameter getInstance() {
    return parameter;
  }
  public void setX2(int x) {
    x2 = x;
  }
}
