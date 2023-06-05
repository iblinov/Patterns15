package by.epam.pattern.chainofresponsibility;

public class SecondHandler extends AbstractHandler {

    public SecondHandler(AbstractHandler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest() {
        //
        successor.handleRequest();
    }
}
