package by.bsu.pattern.factory;

import by.bsu.pattern.entity.Item;

import java.util.function.Supplier;

public class FunctionalItemFactory implements Supplier<Item> {
  @Override
  public Item get() {
    return new Item();
  }
}
