package by.bsu.composite_primitive;

import java.util.ArrayList;
import java.util.List;

public class ParagraphComposite implements ParagraphComponent {
  private List<ParagraphComponent> composite = new ArrayList<>();
  @Override
  public int findNumberOfSymbols() {
    int numberOfSymbols = 0;
    for(ParagraphComponent component : composite) {
      numberOfSymbols += component.findNumberOfSymbols();
    }
    return numberOfSymbols;
  }

  @Override
  public boolean add(ParagraphComponent component) {
    return composite.add(component);
  }

  @Override
  public boolean remove(ParagraphComponent component) {
    return composite.remove(component);
  }

  @Override
  public ParagraphComponent getSubComponent(int index) {
    return composite.get(index);
  }
  public String toString() {
    String result = "";
    for (ParagraphComponent component :composite) {
      result += component.toString() + " ";
    }
    return result;
  }
}
