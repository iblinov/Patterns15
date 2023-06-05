package by.bsu.factory;

import by.bsu.factory.entity.Item;

public class GenericItemFactory extends GenericFactory<Item> {
  @Override
  public Item create() {
    return new Item();
  }
}
