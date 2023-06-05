package by.bsu.observer2;

public class Observer2Demo {
    public static void main(String[] args) {
//        ItemObserver observer = new ItemObserver();
//        Item item = new Item();
//        item.addObserver(observer);
        Item item1 = new Item(72, "Jeans", 42);
        Item item2 = new Item(81, "Gloves", 12);
        Client client1 = new Client(551);
        Client client2 = new Client(500);
        CustomerInterest customerInterest = CustomerInterest.getInstance();
        customerInterest.put(item1.getItemId(), client1);
        customerInterest.put(item1.getItemId(), client2);
        customerInterest.put(item2.getItemId(), client1);
        item1.setPrice(23);
        System.out.println(item1);
        System.out.println(client1);
        System.out.println(client2);
        item2.setPrice(10);
        System.out.println(item2);
        System.out.println(client1);
        System.out.println(client2);
    }
}
