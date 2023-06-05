package by.bsu.pattern.factory;

import by.bsu.pattern.entity.Entity;
import by.bsu.pattern.entity.Item;

public class GenericItemFactory extends GenericFactory<Item> {
  @Override
  public Item create() {
    return new Item();
  }
}
