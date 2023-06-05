package by.bsu.observer;
public class SquareObserver implements OperationObserver {

    public void valueChanged(RectangleEvent observed) {
        long id = observed.getSource().getRectangleId();
        RectangleWarehouse warehouse = RectangleWarehouse.getInstance();
        RectangleAction action = new RectangleAction();
        float square = action.defineSquare(observed.getSource());
        warehouse.changeSquare(id, square);
    }
}