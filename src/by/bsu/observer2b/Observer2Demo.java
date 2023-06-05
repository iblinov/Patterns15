package by.bsu.observer2b;

public class Observer2Demo {
    public static void main(String[] args) {
        Item item1 = new Item(72, "Jeans", 42);
        Item item2 = new Item(81, "Gloves", 12);
        Client client1 = new Client(551);
        Client client2 = new Client(500);
        item1.addClient(client1);
        item1.addClient(client2);
        item2.addClient(client1);
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
