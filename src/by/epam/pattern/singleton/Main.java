package by.epam.pattern.singleton;

public class Main {
  public static void main(String[] args) {
    SingletonMany ob = SingletonMany.ONE;
    SingletonMany ob1 = SingletonMany.THREE;
    SingletonMany ob2 = SingletonMany.TWO;
    SingletonMany ob3 = SingletonMany.valueOf("one".toUpperCase());
    System.out.println(ob.ordinal() < ob3.ordinal());
  }
}
