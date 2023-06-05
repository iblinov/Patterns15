package by.bsu.factory;

import by.bsu.factory.entity.Entity;
import by.bsu.factory.entity.Item;
import by.bsu.factory.entity.Thing;

import java.util.function.Supplier;

public class FunctionalMain {
  public static void main(String[] args) {
    FunctionalFactory<Entity> entity = (o) -> new Entity();
    Supplier<Item> itemSupplier = () -> new Item();

    Supplier<Thing> thingSupplier = Thing::new;
    Thing thing = thingSupplier.get();
  }
}
