package by.bsu.observer;

public class ObserverDemo {
    public static void main(String args[]) {
        RectangleWarehouse warehouse = RectangleWarehouse.getInstance();
        Rectangle rectangle = new Rectangle(777, 5, 3);
        System.out.println(rectangle);
        rectangle.addObserver(new SquareObserver());
        rectangle.addObserver(new PerimeterObserver());

        warehouse.put(rectangle);
        System.out.println(warehouse);
        rectangle.setWidth(10);
        System.out.println(warehouse);
        rectangle.setHeight(8);
        System.out.println(warehouse);
        Rectangle rectangle1 = new Rectangle(555, 4, 6);
        System.out.println(rectangle1);
        rectangle1.addObserver(new PerimeterObserver());

        warehouse.put(rectangle1);
        System.out.println(warehouse);
        rectangle1.setWidth(14);
        warehouse.remove(777L);
        System.out.println(warehouse);
        rectangle1.setHeight(16);
        System.out.println(warehouse);
    }
}

