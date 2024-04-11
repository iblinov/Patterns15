package by.bsu.composite2;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent{
  private List<TextComponent> components = new ArrayList<>();
  private TextType type;
  public void setType(TextType type) {
    this.type = type;
  }

  public boolean add(TextComponent textComponent) {
    return components.add(textComponent);
  }

  @Override
  public String action() {
    String text = "";
    text += " " + type + " ";
    for (TextComponent component : components) {
     text += component.action();
    }
    return text;
  }

  @Override
  public int count() {
    int counter = 0;
    for (TextComponent component: components) {
      counter += component.count();
    }
    return counter;
   // return components.stream().mapToInt(x -> x.count()).sum();
  }
}
