package by.bsu.observer;
import java.util.ArrayList;
public class Rectangle {
    private long rectangleId;
    private float width;
    private float height;
    private ArrayList<OperationObserver> observerList =
            new ArrayList<OperationObserver>();
    public Rectangle(long rectangleId, float width, float height) {
        this.width = width;
        this.height = height;
        this.rectangleId = rectangleId;
    }
    public void addObserver(OperationObserver observer) {
        observerList.add(observer);
    }
    public float getWidth() {
        return width;
    }
    public float getHeight() {
        return height;
    }
    public void setWidth(float width) {
        this.width = width;
        notifyObservers();
    }
    public void setHeight(float height) {
        this.height = height;
        notifyObservers();
    }
    private void notifyObservers() {
         for (OperationObserver observer : observerList) {
            observer.valueChanged(new RectangleEvent(this));
        }
    }
    public long getRectangleId() {
        return rectangleId;
    }
    @Override
    public String toString() {
        return "Rectangle{Id=" + rectangleId +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
