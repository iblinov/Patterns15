package by.epam.pattern.chainofresponsibility;

public class SecondHandler extends AbstractHandler {

    @Override
    public void handleRequest() {
        System.out.println("SecondHandler action");
        //action
        //action 2
        successor.handleRequest();
    }
}
