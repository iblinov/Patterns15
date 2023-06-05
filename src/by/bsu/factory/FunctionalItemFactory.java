package by.bsu.factory;

import by.bsu.factory.entity.Item;

import java.time.LocalDate;
import java.util.function.Supplier;

public class FunctionalItemFactory implements Supplier<Item> {
  @Override
  public Item get() {

    return new Item();
  }
}
