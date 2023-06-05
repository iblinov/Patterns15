package by.epam.pattern.composite;

public interface Component {
  Component add(Component component);
  boolean delete(Component component);
  Component getChild();
  int offence();
  boolean defence(int hit);
}
