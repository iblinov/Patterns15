package by.bsu.observer2;

import java.util.Observable;
import java.util.Observer;

public class ItemObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Item changed = (Item)o;
        Long id = changed.getItemId();
        CustomerInterest.getInstance().notifyPriceChanged(id);

    }
}
