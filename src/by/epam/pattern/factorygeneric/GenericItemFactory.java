package by.epam.pattern.factorygeneric;

import by.bsu.factory.entity.Item;

public class GenericItemFactory implements GenericFactory<Item> {
  @Override
  public Item create() {
    return new Item();
  }
}
