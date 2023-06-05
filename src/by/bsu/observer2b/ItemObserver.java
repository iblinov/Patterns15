package by.bsu.observer2b;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;

public class ItemObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Item observable = (Item)o;
        Long id = observable.getItemId();
        float price = observable.getPrice();
        HashSet<Client> clients = (HashSet<Client>)arg;
        clients.forEach(c->c.addMessage("product item (ID="+ id + ") price changed (" + price+ ")"));
    }
}
