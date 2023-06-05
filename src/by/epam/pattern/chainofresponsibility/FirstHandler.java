package by.epam.pattern.chainofresponsibility;

public class FirstHandler extends AbstractHandler {

  public FirstHandler(AbstractHandler successor) {
    this.successor = successor;
  }

  @Override
  public void handleRequest() {
    //
    successor.handleRequest();
  }
}
