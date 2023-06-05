package by.bsu.observer;

public class RectangleAction {
    public float definePerimeter(Rectangle rectangle){
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }
    public float defineSquare(Rectangle rectangle){
        return rectangle.getWidth() * rectangle.getHeight();
    }
}
