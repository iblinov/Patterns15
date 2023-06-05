package by.bsu.factory;

import by.bsu.factory.entity.Entity;
import by.bsu.factory.entity.Item;
import by.bsu.factory.entity.Thing;

public class PrimitiveEntityFactory {
  public static Entity createEntity(String mode) {
    switch (mode.toLowerCase()) {
      case "entity" : return new Entity();
      case "item" : return new Item();
      case "thing" : return new Thing();
      default: throw new IllegalArgumentException(mode);
    }
  }
}
