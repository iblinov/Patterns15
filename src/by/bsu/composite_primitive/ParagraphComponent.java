package by.bsu.composite_primitive;

public interface ParagraphComponent {
  int findNumberOfSymbols();
  boolean add(ParagraphComponent component);
  boolean remove(ParagraphComponent component);
  ParagraphComponent getSubComponent(int index);
}
