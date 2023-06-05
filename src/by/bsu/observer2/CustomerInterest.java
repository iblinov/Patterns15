package by.bsu.observer2;

import java.util.HashMap;
import java.util.HashSet;

public class CustomerInterest {
    private static final CustomerInterest instamce = new CustomerInterest();
    private HashMap<Long, HashSet<Client>> itemToCustomer = new HashMap<>();
    private CustomerInterest() {
    }
    public static CustomerInterest getInstance(){
        return instamce;
    }
    public void put(Long itemId, Client client) {
         if(itemToCustomer.containsKey(itemId)){
             HashSet<Client> setClients = itemToCustomer.get(itemId);
             setClients.add(client);
         } else {
             HashSet<Client> setClients = new HashSet<>();
             setClients.add(client);
             itemToCustomer.put(itemId, setClients);
         }
    }
    public void notifyPriceChanged(Long itemId){
        if(itemToCustomer.containsKey(itemId)){
            itemToCustomer.get(itemId).forEach(o->o.addMessage("product itemId "+ itemId + " price changed"));
        }
    }
    public boolean remove(Object key, Object value) {
        return itemToCustomer.remove(key, value);
    }
}
