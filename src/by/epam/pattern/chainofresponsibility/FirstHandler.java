package by.epam.pattern.chainofresponsibility;

public class FirstHandler extends AbstractHandler {


  @Override
  public void handleRequest() {
    System.out.println("FirstHandler action");
    //action
    successor.handleRequest();
  }
}
