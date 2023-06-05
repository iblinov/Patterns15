package by.bsu.pattern.factory;

import by.bsu.pattern.entity.Entity;
import by.bsu.pattern.entity.Item;
import by.bsu.pattern.entity.Thing;

import java.util.function.Supplier;

public class FunctionalMain {
  public static void main(String[] args) {
    FunctionalFactory<Entity> entity = (o) -> new Entity();
    Supplier<Item> itemSupplier = () -> new Item();

    Supplier<Thing> thingSupplier = Thing::new;
    Thing thing = thingSupplier.get();
  }
}
