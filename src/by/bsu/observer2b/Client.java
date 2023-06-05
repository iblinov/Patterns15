package by.bsu.observer2b;
import java.util.ArrayList;

public class Client {
    private long clientId;
    private ArrayList<String> messages = new ArrayList<>();
    public Client(long clientId) {
        this.clientId = clientId;
    }
    public void addMessage(String message) {
        messages.add(message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (clientId != client.clientId) return false;
        return messages != null ? messages.equals(client.messages) : client.messages == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (clientId ^ (clientId >>> 32));
        result = 31 * result + (messages != null ? messages.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ClientId=" + clientId +
                ", messages=" + messages;
    }
}
