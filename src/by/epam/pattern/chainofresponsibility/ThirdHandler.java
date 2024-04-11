package by.epam.pattern.chainofresponsibility;

public class ThirdHandler extends AbstractHandler {
    @Override
    public void handleRequest() {
        System.out.println("ThirdHandler action. end chain");
        //action
    }
}
