package by.bsu.observer;
public class PerimeterObserver implements OperationObserver {

    public void valueChanged(RectangleEvent observed) {
        long id = observed.getSource().getRectangleId();
        RectangleWarehouse warehouse = RectangleWarehouse.getInstance();
        RectangleAction action = new RectangleAction();
        float perimeter = action.definePerimeter(observed.getSource());
        warehouse.changePerimeter(id, perimeter);
    }
}