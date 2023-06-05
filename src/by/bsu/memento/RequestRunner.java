package by.bsu.memento;

import java.util.HashMap;

public class RequestRunner {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    String winner = map.put("1", "Winner");
    RequestParameter req = new RequestParameter(map);
    System.out.println("first " + req.getParams());
    Memento memento = req.getMemento();
    Caretaker care = new Caretaker(memento);
    req.addParam("1", "Loser");
    memento = req.getMemento();
    care.setMemento(memento);
    System.out.println("second " + req.getParams());
    memento = care.prevMemento();
    req.setMemento(memento);
    System.out.println("undo to first " + req.getParams());
    memento = care.nextMemento();
    req.setMemento(memento);
    System.out.println("undo to second " + req.getParams());
  }
}