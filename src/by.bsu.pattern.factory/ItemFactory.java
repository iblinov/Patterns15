package by.bsu.pattern.factory;

import by.bsu.pattern.entity.Item;

public class ItemFactory extends BaseEntityFactory {
  @Override
  public Item createEntity() {
    return new Item();
  }
}
