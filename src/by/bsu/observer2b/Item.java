package by.bsu.observer2b;

import java.util.HashSet;
import java.util.Observable;

public class Item extends Observable {
    private long itemId;
    private String name;
    private float price;
    private HashSet<Client> setClients = new HashSet<>();
    {
        this.addObserver(new ItemObserver());
    }
    public Item(long itemId, String name, float price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }
    public void addClient(Client client) {
        setClients.add(client);
    }
    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;


    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        setChanged();
        notifyObservers(setClients);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (itemId != item.itemId) return false;
        if (Float.compare(item.price, price) != 0) return false;
        return name != null ? name.equals(item.name) : item.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (itemId ^ (itemId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ItemId=" + itemId +
                ", name='" + name + '\'' +
                ", price=" + price;
    }
}
