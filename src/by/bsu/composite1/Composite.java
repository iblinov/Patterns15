package by.bsu.composite1;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component  {
  private List<Component> components = new ArrayList<>();

  @Override
  public Component add(Component component) {
     components.add(component);
     return this;
  }

  @Override
  public boolean delete(Component component) {
    return components.remove(component);
  }

  @Override
  public Component getChild() {
    return null;
  }

  @Override
  public int offence() {
    int result = 0;
    for (Component component : components) {
      result += component.offence();
    }
//    result =  components.stream().mapToInt(o -> o.offence()).sum();
    return result;
  }

  @Override
  public boolean defence(int hit) {
    return false;
  }
}
