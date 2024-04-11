package by.epam.pattern.chainofresponsibility;

import java.util.List;

public abstract class AbstractHandler {
  protected AbstractHandler successor;
  public abstract void handleRequest();//parse()

  public void setSuccessor(AbstractHandler successor) {
    this.successor = successor;
  }
}
