package by.epam.pattern.chainofresponsibility;

public class ChainMain {
  public static void main(String[] args) {

    FirstHandler handler1 = new FirstHandler();
    SecondHandler handler2 = new SecondHandler();
    ThirdHandler handler3 = new ThirdHandler();
    handler2.setSuccessor(handler1);
    handler1.setSuccessor(handler3);

    handler2.handleRequest();
  }
}
