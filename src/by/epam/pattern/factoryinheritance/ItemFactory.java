package by.epam.pattern.factoryinheritance;

import by.bsu.factory.entity.Item;

public class ItemFactory extends EntityFactory {
  @Override
  public Item create() {
    return new Item();
  }
}
