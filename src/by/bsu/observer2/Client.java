package by.bsu.observer2;

import java.util.ArrayList;
import java.util.HashSet;

public class Client {
    private long clientId;
//    private HashSet<Long> items = new HashSet<>();
    private ArrayList<String> messages = new ArrayList<>();

    public Client(long clientId) {
        this.clientId = clientId;
    }

    public void addMessage(String message) {
        messages.add(message);
    }
    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

//    public HashSet<Long> getItems() {
//        return items;
//    }
//
//    public void addItem(Long itemId) {
//       items.add(itemId);
//    }

    @Override
    public String toString() {
        return "ClientId=" + clientId +
                ", messages=" + messages;
    }
}
